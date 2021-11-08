package pack01_if;

public class Ex01_if {
	public static void main(String[] args) {
		//if == 만약에 ( 조건식 )
		//조건식 : 반드시 네 또는 아니오 ( 참(true) or 거짓(false) ) 로 대답할 수 있는 식
		//조건식이 될 수 없는 것 : 1+1 , 너의 이름이 뭐니?...
		//조건식이 될 수 있느 ㄴ것 : (1+1)==2 , 너의 이름은 ㅇㅇㅇ이냐?...
		int score = 75;
		// if(조건식){  참일 때 실행할 코드 } //
		if (score > 90) { 
			// ↑ 식이 참일 때만!! 실행되는 코드
			System.out.println("점수가 90보다 큽니다.");
		}
		//score에 값은 그대로 둔 상태에서
		//if문 하나를 더 선언하고 score 75값을 비교했을 때 참이 되는 조건식을 하나 넣고
		//콘솔 창에 70보다 큽니다 라는 문자열 출력
		if (score > 50) {
			System.out.println("70보다 큽니다.");
	}
	
		if (score > 0) {
			System.out.println("0보다 크다");
		}
		
		if (score <= 75) {
			System.out.println("75보다 같거나 작다");
		}
		if (score < 80) {
			System.out.println("80보다 작다");
		}
		if (score >= 75) {
			System.out.println("75보다 같거나 크다");
		}
	}
}