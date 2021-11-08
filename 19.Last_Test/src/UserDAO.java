
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserDAO {
	int student_no = 1;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	int isCount = 0; // DB에 정보가 있는지 cnt
	int loginCount = 0; // 로그인 시 ID 또는 PW 불일치 횟수

	Scanner sc = new Scanner(System.in);

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
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String rtnStr(String msg) {
		// 공백문자를 제거하고 한글자 이상 입력했는지 체크
		// 3글자 이상 입력했는지 체크
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(msg);
			String inputData = sc.nextLine();
			if (inputData.trim().length() > 0) {
				return inputData;
			}
			break;
		} // 무한반복문 아래 코드는 실행 될 수가 없다. break가 없다면
		return "";
	}

	public boolean login(UserDTO dto) {
		while (true) {
			if (loginCount < 3) {
				String user_id = rtnStr("USER_ID를 입력해주세요");
				String user_pw = rtnStr("USER_PW를 입력하세요.");

				String sql = " SELECT COUNT(*) as count " + " FROM USER_TBL " + " WHERE STUDENT_NO = 1 "
						+ " AND USER_ID = ? " + " AND USER_PW = ? ";
				try {
					ps = conn.prepareStatement(sql);
					ps.setString(1, user_id);
					ps.setString(2, user_pw);

					rs = ps.executeQuery();
					if (rs.next()) {
						isCount = Integer.parseInt(rs.getString("count"));
						if (isCount > 0) {
							System.out.println("로그인되었습니다");
							return true;
						} else {
							System.out.println("ID 또는 PW를" + (loginCount + 1) + "회 틀리셨습니다.");
							System.out.println("ID 또는 PW를 확인해주세요.");
							loginCount++;
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (loginCount > 2) {
				System.out.println("ID 또는 PW를 3회 틀리셨습니다.");
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} else {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}
		return false;
	}

	public boolean checkPw() {
		String user_id = rtnStr("USER_ID를 입력해주세요");
		String user_pw = rtnStr("USER_PW를 입력하세요.");
		conn = getConn();
		String sql = " SELECT COUNT(*) as count " + " FROM USER_TBL " + " WHERE STUDENT_NO = 1 " + " AND USER_ID = ? "
				+ " AND USER_PW = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setString(2, user_pw);

			rs = ps.executeQuery();
			if (rs.next()) {
				isCount = Integer.parseInt(rs.getString("count"));
				if (isCount > 0) {
					System.out.println("정보 일치");
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public void updateMember(UserDTO dto) {
		getConn();
		String user_id = rtnStr("변경할 ID를 입력하세요.(1글자 이상)");
		String user_pw = rtnStr("변경할 PW를 입력하세요.(1글자 이상)");
		String firstname = rtnStr("변경할 firstname를 입력하세요.(1글자 이상)");
		String lastname = rtnStr("변경할 lastname를 입력하세요.(1글자 이상)");
		String sql = " UPDATE USER_TBL " + " SET User_id = ?, User_pw = ?, Firstname = ?, Lastname = ? "
				+ " WHERE student_no = 1 ";

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setString(2, user_pw);
			ps.setString(3, firstname);
			ps.setString(4, lastname);
			int result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("회원정보가 수정되었습니다.");
			} else {
				System.out.println("회원 정보 수정 X");
			}
		} catch (Exception e) {
			System.out.println("수정 실패 update error");
			e.printStackTrace();
		}

	}

	public void deleteMember(UserDTO dto) {
		getConn();
		String user_id = rtnStr("탈퇴할 ID를 입력하세요.(1글자 이상)");
		String user_pw = rtnStr("탈회할 PW를 입력하세요.(1글자 이상)");
		String sql = " DELETE from user_tbl " + "where student_no = 1 " + "and user_id = ? " + "and user_pw = ? ";
		try {

			ps = conn.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setString(2, user_pw);
			int result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("회원탈퇴가 완료되었습니다.");
			} else {
				System.out.println("회원탈퇴 X");
			}
		} catch (Exception e) {
			System.out.println("삭제 실패 delete error");
			e.printStackTrace();
		}
	}

	public boolean doubleCheck(String id) {
		// 1.연결객체가 필요
		getConn();
		String sql = "select count(*) cnt " + "from user_tbl " + "where student_no = 1 " + "and user_id = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();// 쿼리 실행한 결과를 받아주기
			while (rs.next()) {
				if (rs.getInt("cnt") == 1) {
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbclose();
		}
		return true;
	}

	public void insertMember() {
		// 아이디 중복확인메소드가 필요함.
		String user_id;
		while (true) {
			user_id = rtnStr("ID를 입력하세요.(1글자 이상)");
			if (!doubleCheck(user_id)) {
				System.out.println("ID가 중복되었습니다.");
			} else {
				break;
			}
		}
		String user_pw = rtnStr("PW를 입력하세요.(1글자 이상)");
		String firstname = rtnStr("firstname를 입력하세요.(1글자 이상)");
		String lastname = rtnStr("lastname를 입력하세요.(1글자 이상)");
		// 1.연결객체 2.전송객체 3.select(ResultSet으로 받을 필요가 x)
		String sql = "INSERT INTO user_tbl (STUDENT_NO, USER_ID, USER_PW, FIRSTNAME, LASTNAME) "
				+ "VALUES                (?, ?, ?, ?, ?) ";
		getConn();// 연결이 됨
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, student_no);
			ps.setString(2, user_id);
			ps.setString(3, user_pw);
			ps.setString(4, firstname);
			ps.setString(5, lastname);
			int result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("회원가입이 완료되었습니다.");
			} else {
				System.out.println("회원가입 X");
			}
		} catch (SQLException e) {
			System.out.println("회원가입 실패 insert error");
			e.printStackTrace();
		}
	}
}
