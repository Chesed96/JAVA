package pack02_switch;

public class Ex02_SwitchNObreak {
	public static void main(String[] args) {
		
		int time = 9;
		switch(time) {
			case 8:
				System.out.println("출근을 합니다."); // break가 없기때문에 조건을 만족한 부분부터 마지막까지 모두 실행
			case 9:
				System.out.println("아침회의를 합니다.");
			case 10:
				System.out.println("커피를 마십니다.");
			default:
				System.out.println("일을합니다.");
		}
	}
}
