package pack10_abstract;

public class Dog extends Animal{
//abstract ← 상속을 받게되면 어떠한 메소들은 강제로 구현을 하게 만드는 기법
//↑ Interface 라는 설계도 개념을 사용함.
//(abstract로 되어있음) 어떠한 메소드들을 사용할 것인지 정의만 해둠 (기능x)
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}

}
