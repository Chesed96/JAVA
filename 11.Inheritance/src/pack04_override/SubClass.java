package pack04_override;

public class SubClass extends SuperClass {
	
	
	public void printName() {
		// TODO Auto-generated method stub
		super.printName();
	}
	public void printName(String name) {
		System.out.println(name + "이름을 출력합니다.");
	}
}
