import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//DAO Data Access Object
//JDBC Java Database Connectivity
//(oracle, mssql, mysql, mariaDB....)
public class Ex01_DAO {	//실제 DB와 연동하여 요구사항 처리 후 리턴(main실행부로)
	private Connection conn; //연결객체 //수도관 파이프
	private PreparedStatement ps; //전송객체 //물
	private ResultSet rs; //결과객체 // 수도꼭지에서 물이 나오는 것을 봄
	//선언만 해둔 상태이기 때문에 모든 객체들은null 상태이다.
	//DB에 접속할 수 있는 접속 정보를 정의하고 Connection 객체부터 차례대로 초기화를 시켜야함.
	
	//Connection을 리턴하는 메소드를 만들어야한다.
	//리턴타입이 있는 → void가 아닌 메소드
	
	//DB접속 메소드
	public Connection getConn() {
		//url(아이피 정보, 포트정보, 오라클 버전 정보)
		//user(계정의 이름) ex) hanul
		//password ex) 0000
		//ojbc8 ← 동적 클래스 로딩하는 로직이 필요함.
		//oracle.jdbc.driver.OracleDriver ← 동적 로딩할 드라이버형태의 클래스(자동완성 사용)
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		String url = "jdbc:oracle:thin:@192.168.0.39:1521:xe";
		String user = "hanul";
		String password = "0000";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			//임시로 테스트할 코딩을 추가, 연결테스트 완료 후 삭제 예정
//			if(conn.isClosed()) {
//				System.out.println("연결이 닫힘");
//			}else {
//				System.out.println("연결이 안닫힘");
//			conn.close();	
//			}if(conn.isClosed()) {
//				System.out.println("연결이 닫힘");
//			}else {
//				System.out.println("연결이 안닫힘");
//			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getConn() 에러났음");
		}
		
		//oracle dev → 새접속 → 접속정보  hanul@//localhost:1521/xe
		return conn;
	}
	//리턴타입이 없는 → void인 형태의 메소드
	//작업 순서(정순) : 접속(conn), 전송(ps), 결과(rs)
	//종료 순서(역순) : 결과 객체 비우기(닫기), 전송객체 닫기, 젒고 객체 닫기
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
		//전송시 필요한 것 (SQL문) == String
		//전송객체를 접속 객체를 이용해서 초기화 시켜야함.
		conn = getConn();//DB접속이 가능하게 Connection conn 객체를 초기화 시키기.
		String userData = "kehData";
		
		//String sql = " select '" + userData +  "' data from dual ";
		//구버전 방법 어떤 파라메터를 오라클까지 전송하기에 매우 불편하다 ↑
		String sql = " select ? data1, ? data2 from dual ";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userData);
			ps.setString(2, " test");
			rs = ps.executeQuery();
			while(rs.next()) {
				//data를 받는 방법 (dataGethering)
				//int num =rs.getInt("num");
				String data = rs.getString("data1");
				
				//?
				System.out.println(data + "데이터가 있습니다." + rs.getString("data2"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connTest()에서 에러 발생!");
		}finally {
			// 1.접속 2.전송객체를 통해 sql문 보냄 3. 결과 객체에 전송객체에 결과를 닫음
			// 4.연결을 해제한다.
			dbclose();
		}
	}

	public ArrayList<Ex01_DTO> memberSelect() {
		ArrayList<Ex01_DTO> list = new ArrayList<>();
		conn = getConn();	//접속 객체를 메소드를 이용해서 초기화.
		String sql = " select * from tblmember ";
		try {
			
			ps = conn.prepareStatement(sql);
//			ps.setString();
			rs = ps.executeQuery();
			//전송객체가 쿼리를 실행하고 그 결과를 rs에 담음
			while(rs.next()) {
//				String data = rs.getString("name");
//				Ex01_DTO dto = new Ex01_DTO(1, "홍길동", 30, "광주", "062-111-1111");
				list.add(new Ex01_DTO(rs.getInt("num"),rs.getString("name") , rs.getInt("age"), rs.getString("addr"), rs.getString("tel")));
//				System.out.println(rs.getString("num") + rs.getString("name"));
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

