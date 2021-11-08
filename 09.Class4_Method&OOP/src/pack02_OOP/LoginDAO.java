package pack02_OOP;
//실제 로그인 기능이 들어가는 곳.
public class LoginDAO {
	//메소드는 return 타입이 없으면 반환 받을 값이 필요없으며 void
	//return타입이 필요하다면 void가 아닌 내가 필요한 데이터 타입으로 만들면 됨.
	
	//↓true와 false만을 반환하는 boolean 타입의 메소드
	public boolean login (LoginDTO dto) {
		if(dto.id.equals("hong") && dto.pw.equals("1234")) {
			System.out.println("로그인되었습니다.");
			return true;
		}
			System.out.println("ID와 PW를 확인하세요.");
			return false;
	}
}
