package package3;

public class D {
	//private 접근제한자
	//메소드, 변수(field) 인스턴스 또는 static멤버에 붙는 접근 제한자.
	D d1 = new D(1);// O  int형
	D d2 = new D("2");// O string형
	D d3 = new D();//O	private형
			
	public D(int num) {	}
	D(String data){	}	//눈으로 확인은 안되지만 별도의 접근 제한자를 지정하지 않으면 그 접근제한자default이다.
	private D() {	}
}
