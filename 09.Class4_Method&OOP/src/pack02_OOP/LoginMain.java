package pack02_OOP;

import java.util.Scanner;

public class LoginMain {
	public static void main(String[] args) {
		//사용자가 입력한 값 View단이 없을 때는 항상 Console
		System.out.println("ID와 PW를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		String pw = sc.nextLine();
		LoginDTO dto = new LoginDTO(id, pw);
		
		
		LoginDAO dao = new LoginDAO();
		if(dao.login(dto)) {
			//return type이 boolean이기 때문에 반드시 true,false의 값을 반환받을 수 있다.
			//따라서 반환되는 데이터를 if문의 조건으로 사용이 가능하다.
			System.out.println(id +"로그인이 되었습니다.");
		}else {
			System.out.println("아이디나 비밀번호를 확인해주세요.");
		}
		
		
		
		
	}
}
