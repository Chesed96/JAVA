package pack01_Interface;

public interface Testinterface {
	String SEVERIP = "192.168.0.10";
	void test1();
	void test2();
	void test3();
	int DATA = 10;	//우리 눈에는 안보이지만 interface에서 변수의 선언은
					//일반 변수가 아니라 final변수(상수). 바꿀 수 없는 변수.
}
