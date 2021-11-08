package pack02_field;

public class Ex02_CarMain {
	public static void main(String[] args) {
		//main 메소드가 없으면 java 소스파일은 실행 안됨.
		//Ex02 ← 객체를 인스턴스화(사용준비)를 하면 객체의 속성들을 이용할 수 가 있다.
		//Ex02_Car를  인스턴스화(객체화) 하세요.
		Ex02_Car car = new Ex02_Car();	//사용준비완료(객체화, 인스턴스화)
		//syso로 출력
		System.out.println(car.model);
		System.out.println(car.company);
		System.out.println(car.color);
		//검정 → 빨강
		car.color = "빨강";
		System.out.println(car.color);
		
		System.out.println(car.speed);
		System.out.println("사람이 타서 엑셀을 밟았습니다.");
		//사람이 타서 엑셀을 밟았을 때 속도가 50이라고 바뀌게 작업.
		car.speed = 50;
		System.out.println(car.speed);
		
		
		
		
	}
}
