import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_HRDAO {	
	private Connection conn; 
	private PreparedStatement ps; 
	private ResultSet rs; 
	
	//DB접속 메소드
	public Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		String url = "jdbc:oracle:thin:@192.168.0.39:1521:xe";
		String user = "hr";
		String password = "0000";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getConn() 에러났음");
		}
		
		return conn;
	}
	public void dbclose() { 
		try {
			//NullPointException
			//를 가장 쉽게 회피(예외처리)하는 방법.
			if(rs != null) {
				rs.close();
			}
			if(ps != null) {
				ps.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void connTest() {
		conn = getConn();
		String userData = "kehData";
		String sql = " select ? data1, ? data2 from dual ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userData);
			ps.setString(2, " test");
			rs = ps.executeQuery();
			while(rs.next()) {
				String data = rs.getString("data1");
				System.out.println(data + "데이터가 있습니다." + rs.getString("data2"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connTest()에서 에러 발생!");
		}finally {
			dbclose();
		}
	}

	public ArrayList<Ex02_HRDTO> memberSelect() {
		ArrayList<Ex02_HRDTO> list = new ArrayList<>();
		conn = getConn();	
		String sql = " select * from employees " + " where employee_id between 100 and 110 ";
		try {
			
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Ex02_HRDTO(rs.getInt("employee_id"),rs.getString("first_name") , rs.getString("last_name"), rs.getString("email"), rs.getString("phone_number")));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("memberSelect()에서 에러 발생!");
		}finally {
			dbclose();
		}
		return list;
	}

	public ArrayList<Ex02_HRDTO> memberSelectUser(int a, int b) {
		ArrayList<Ex02_HRDTO> list = new ArrayList<>();
		conn = getConn();
		String sql = " SELECT * from employees" + " where employee_id BETWEEN ? and ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, a);
			ps.setInt(2, b);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Ex02_HRDTO(rs.getInt("employee_id"),rs.getString("first_name") , rs.getString("last_name"), rs.getString("email"), rs.getString("phone_number")));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("memberSelect()에서 에러 발생!");
		}finally {
			dbclose();
		}
		return list;
	}
}

