package pack06_changeType1;

public class PromotionMain {
	public static void main(String[] args) {
		A a = new A();	//부모클래스
		B b = new B();	//A의 자식 클래스
		C c = new C();	//A의 자식 클래스
		D d = new D();	//B의 자식 클래스
		E e = new E();	//C의 자식 클래스
		//데이터를 표현할 수 있는 크기가 더 작은 것 → 큰 것
		//									  큰 것 → 작은것
		//	(int) double
		e = (E) c;	//큰 것 → 작은 것
	
				
	}

}
