package pack02_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	//디비 접속에 필요한 접속 객체 
	//전송에 필요한 전송객체
	//전송객체를 통해 결과를 받는 결과객체 
	
	//select '자기 이니셜 ' from dual;
	private Connection conn; // 연결객체
	private PreparedStatement ps;// 전송 객체
	private ResultSet rs; 
	public Connection getConn() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "hanul";
		String password = "0000";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void dbClose() {
		try {
			if(rs != null) {rs.close();}
			if(ps != null) {ps.close();}
			if(conn != null) {conn.close();}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void connTest() {
		conn = getConn();
		String userData = "kehData";
		String sql = " select ? as data1 , ? as data2 from dual ";
		System.out.println(sql);
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userData);
			ps.setString(2, "test");
			rs = ps.executeQuery();
			while(rs.next()) {
				String data = rs.getString("data1");
				System.out.println(data + "데이터가 있습니다."+rs.getString("data2"));
			}
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("connTest()에서 에러 발생!");
		}finally {

			dbClose();
		}
	}

	public void insertMember(MemberDTO dto) {
		conn = getConn();
		String sql = "INSERT INTO TBLMEMBER (NUM, NAME, AGE, ADDR, TEL) " + 
				"VALUES (?, ?, ?, ?, ?) ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getAge());
			ps.setString(4, dto.getAddr());
			ps.setString(5, dto.getTel());
			//데이터를 조작하게되면 (select x)
			//행의 삽입(추가) , 행의 수정 , 행의 삭제
			int result = ps.executeUpdate();//Table Update 결과 1=성공 , 그외값은 실패
			System.out.println(result);
		}catch (Exception e) {
			System.out.println("삽입 실패 insert error");
			e.printStackTrace();
		}
	}
	
	public void updateMember(MemberDTO dto) {
		conn = getConn();
		String sql = " UPDATE tblmember " + 
				" SET name = ?, age = ?, addr = ?, tel = ? " + 
				" WHERE num = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setInt(2, dto.getAge());
			ps.setString(3, dto.getAddr());
			ps.setString(4, dto.getTel());
			ps.setInt(5, dto.getNum());
			int result = ps.executeUpdate();//Table Update 결과 1=성공 , 그외값은 실패
			System.out.println(result);
		}catch (Exception e) {
			System.out.println("수정 실패 update error");
			e.printStackTrace();
		}
		
	}

	public void deleteMember(MemberDTO dto) {
		conn = getConn();
		String sql = " DELETE FROM tblmember " + 
				" WHERE num = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			int result = ps.executeUpdate();//Table Update 결과 1=성공 , 그외값은 실패
			System.out.println(result);
		}catch (Exception e) {
			System.out.println("삭제 실패 delete error");
			e.printStackTrace();
		}
	}
	
	public ArrayList<MemberDTO> memberSelect() {
		ArrayList<MemberDTO> list = new ArrayList<>();
		conn = getConn();	//접속 객체를 메소드를 이용해서 초기화.
		String sql = " select * from tblmember ";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new MemberDTO(rs.getInt("num"),rs.getString("name") , rs.getInt("age"), rs.getString("addr"), rs.getString("tel")));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("memberSelect()에서 에러 발생!");
		}finally {
			dbClose();
		}
		return list;
	}

	
}
