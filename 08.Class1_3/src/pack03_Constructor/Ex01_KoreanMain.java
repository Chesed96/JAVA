package pack03_Constructor;

public class Ex01_KoreanMain {
	public static void main(String[] args) {
		//첫번째 객체는 매개변수가 없는 타입.
		Ex01_Korean kor1 = new Ex01_Korean();
		System.out.println(kor1.name);
		
		//두번째 객체는 매개변수가 있는 타입.
		String n = "이름값";
		String ssn = "주민등록번호";
		Ex01_Korean kor2 = new Ex01_Korean(n , ssn);
		System.out.println(kor2.name);
		
	}
}
