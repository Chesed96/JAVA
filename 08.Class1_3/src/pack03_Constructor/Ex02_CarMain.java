package pack03_Constructor;

public class Ex02_CarMain {
	public static void main(String[] args) {
		
		//호출 - 정의해놓은 규칙을 맞춰서 불러야한다.
		//ex)Ex02_Car(생성자메소드);
		// → 5개의 값을 줘야지만 호출할 수 있다. (String 3개 int2개)
		Ex02_Car car = new Ex02_Car("현대자동차", "그랜져", "검정", 150, 60);
		System.out.println(car.color);
		System.out.println(car.company);
		System.out.println(car.maxspeed);
		System.out.println(car.model);
		System.out.println(car.speed);
		
	}
}
