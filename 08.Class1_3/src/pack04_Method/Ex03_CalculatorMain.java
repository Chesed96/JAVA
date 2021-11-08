package pack04_Method;

public class Ex03_CalculatorMain {
	public static void main(String[] args) {
//		Ex03_Calculator ec = new Ex03_Calculator();
		//↑비어있는 상태로 이 객체를 생성할 수 없다. (반드시 숫자 두개를 인자로 받아야한다.)
		Ex03_Calculator ec = new Ex03_Calculator(2, 5);
		System.out.println("ec객체의 필드 x :" + ec.x);
		System.out.println("ec객체의 필드 y :" + ec.y);
	
		// 데이터 타입이 있는 경우에만 println 에 담을 수 있다.
		ec.plus();
		ec.minus();
		ec.mul();
		ec.div();
		ec.test();
	}
}
