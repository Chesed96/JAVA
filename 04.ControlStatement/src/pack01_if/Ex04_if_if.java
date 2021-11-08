package pack01_if;

public class Ex04_if_if {
	public static void main(String[] args) {
		//class의 지역 외에서 (메인 메소드 지역, if지역, else지역)
		//어디든 if문은 사용할 수가 있다. (제어문을 사용할 수가 있다.)
		int score = 100;
		if(score > 90) {
			System.out.println("90점보다 큽니다.");
			if(score == 100) {
				System.out.println("만점입니다.");
			}
		}
		//========================if문 중첩if문
		
		//score = 100
		if(score < 90) {
			
		}else {
			System.out.println("점수가 90보다 큽니다.");
			if(score == 100) {
				System.out.println("만점입니다.");
			}
		}
		
		
	}
}
