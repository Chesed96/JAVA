package pack01_class;

public class Ex01_studentMain {
	public static void main(String[] args) {
		//Ex01_student라는 Class를 인스턴스화(객체화)하기. 메모리에 올려서 사용할 수 있게 만들기.
		//변수 초기화(사용할 준비) int a = 0; 0이라는 값을 가지고 초기화
		//참조 변수 초기화(사용할 준비) int[] a = new int[size];
		//Class이름 , 클래스를 객체화해서 사용할 이름(변수명) = new Class이름;
		Ex01_student keh = new Ex01_student();	//인스턴스화(객체를 사용할 준비)
		System.out.println("s1 이라는 객체는 값이 무엇일까요? " + keh);
		Ex01_student keh2 = null;	//레퍼런스 타입은 null로 비워둘 수 있다.
		Ex01_student keh3 = null;
		if(keh2 == keh3) {
			System.out.println("keh2객체와 keh3객체는 참조가 같습니다.");
			System.out.println("keh2 " + keh2 + " keh3 " + keh3);
		}
		keh2 = new Ex01_student();	//사용할 준비가 완료(어딘가를 참조하기 시작함)
		keh3 = new Ex01_student();	//사용할 준비가 완료(어딘가를 참조하기 시작함)
		if(keh2 == keh3) {
			System.out.println("keh2객체와 keh3객체는 참조가 같습니다.");
			System.out.println("keh2 " + keh2);
			System.out.println("keh3 " + keh3);
		}else {
			System.out.println("keh2객체와 keh3객체는 참조가 다릅니다.");
			System.out.println("keh2 " + keh2);
			System.out.println("keh3 " + keh3);
		}
//		String str = new String("");
//		str.length();
	}
}
