package pack05_static;

public class Ex02_Static {
	public static void main(String[] args) {
		display1();
		display2();
	}
	//void display1() → static void display1() 스태틱 멤버로 바뀜
	static void display1() {
		System.out.println("화면 1번입니다.");
	}
	static void display2() {
		System.out.println("화면 2번입니다.");
	}
	static {
		System.out.println("static 초기화 블럭");
		//프로그램 시작 전에 먼저 메모리에 할당, 프로그램 종료 시 소멸
		//프로그램 시작 전(메모리 공간차지) 프로그램 종료 전까지 (메모리 공간차지)
		//static은 가급적 사용을 줄일수록 좋다.
	}
}
