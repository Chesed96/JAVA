package pack04_Method;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
		//인스턴스 멤버를 사용하기 위해서는. 반드시 인스턴스화(객체화)
		Ex02_Calculator cal = new Ex02_Calculator();//계산기 객체화
		cal.powerOn();	// ← 호출
		//int를 return하는 메소드는 int형 변수라고 생각해도 무방하다.
		int result = cal.plus(30, 20);
		System.out.println(result);
		System.out.println(cal.plus(2, 3));
		System.out.println(cal.mul(2, 3));
		System.out.println(cal.mul(5, 1, 3));
		System.out.println(cal.divide(5, 2));
	}
}
