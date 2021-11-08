package pack04_Method;

public class Ex01_Void {
	//인스턴스 멤버(클래스 블럭킹 사이에 있는 모든 것들, static이라는 키워드가 안들어간)
	//인스턴스화(클래스, 객체화)
	//Ex01_Void가 인스턴스화 객체화 되지 않으면 접근할 수 없는 멤버를 뜻한다.
	//Method의 선언(정의)
	//return타입(데이터 타입) 메소드의 이름(의미있는 뜻을 넣어주는 게 관례) 소괄호(){
	//
	//}
	//void 또는 int,String(void가 아닌 데이터 타입) methodName(){
	//}
	//1.main메소드는 return타입이 없다.(void)
	//2.main메소드는 String[]배열을 인자 값으로 받아서 실행을 한다.
	public static void main(String[] args) {
		Ex01_Void ex = new Ex01_Void(); //객체화
		ex.printName();
		ex.printName("이름");
		ex.printName(10);
	}
	//void == return타입이 없는(메소드가 실행된 후에 어떠한 결과도 받지 못한다.)
	void printName() {
		System.out.println("강은혜");
	}
	void printName(String name) {
		System.out.println(name);
	}
	//메소드의 이름이 같으나 파라메터의 갯수나 파라메터의 타입이 다른 경우에는
	//java프로그램이 메소드의 차이를 인식할 수 있으므로 같은 이름의 메소드를 사용할 수 있는 것.
	void printName(int n) {
		System.out.println(n);
	}
	void printName(String name, int a) {
		System.out.println(name + a);
	}
	void printName(String[] arr) {
		System.out.println();
	}
}
