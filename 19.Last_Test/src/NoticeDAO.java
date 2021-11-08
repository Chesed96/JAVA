import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class NoticeDAO {
	
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs; 
		
	public Connection getConn() {
			String url = "jdbc:oracle:thin:@125.136.151.206:1521:xe";
			String user = "javatest";
			String password = "0000";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				e.printStackTrace();
			}	
			
			return conn;
		}
		
	public void dbclose() { 
			try {
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
				e.printStackTrace();
			}
		}
		
	public ArrayList<NoticeDTO> memberSelect() {
		ArrayList<NoticeDTO> list = new ArrayList<>();
		getConn();
		String sql = " select * from NOTICE_TBL ";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new NoticeDTO(rs.getString("id"),rs.getString("title") , rs.getString("content"), rs.getString("writer")));
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
