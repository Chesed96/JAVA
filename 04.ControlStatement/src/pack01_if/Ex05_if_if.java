package pack01_if;

import java.util.Scanner;

public class Ex05_if_if {
	public static void main(String[] args) {
		//중첩 if문 : class를 제외한 어느 지역이든 제어문은 사용이 가능함.
		//지역 → {  }(블럭킹)을 가지고 있는냐? → true 지역이 있다.

		//Scanner를 통해서 값을 입력
		//if문 0보다 크면 if문 내부로 이동
		//10보다 큰지 비교 
		//10보다 크면 if 내부로 이동
		//20보다 크면 "20보다 큽니다."라는 문자열을 콘솔에 출력
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		if(num > 0) {
			if(num > 10) {
				if(num > 20) {
					System.out.println("20보다 큽니다.");
				}
			}
		}
		
		
		
		
		
	}
}
