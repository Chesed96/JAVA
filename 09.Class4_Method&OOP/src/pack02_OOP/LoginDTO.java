package pack02_OOP;

public class LoginDTO {
	String id, pw;
	
	//LoginDTO를 생성할 때 반드시 id.pw를 입력받아야만 한다.
	//비어있는 생성자메소드를 사용할 수 없게 만들어야 한다.
	//→ id,pw를 입력받는 생성자 메소드를 만든다.
	
	//↓파라메터를 입력받는 생성자메소드 생성시 
	// 비어있는 생성자 메소드를 별도로 만들지 않으면 사용할 수 없게됨.
	// 비어있는 생성자 메소드 : LoginDTO Login = new LoginDTO 
	public LoginDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	
}
