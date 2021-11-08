package pack01_if;

import java.util.Scanner;

public class Ex03_if_else {
	public static void main(String[] args) {
		//일반적으로 방금까지 사용한 단순 if문 뒤에 else라는 키워드를 통해
		//if(조건식) 부분이 참이 아닐 때 실행하는 블럭을 만든다.
		//if(조건식) { 참일때 실행 } else { 거짓일 때 실행}
		int score = 75;
		if(score > 90) {
			// 참일 때의 실행부
			System.out.println("점수가 90점보다 큽니다.");
		}else {
			System.out.println("점수가 90점보다 작습니다.");
			//거짓일 때의 실행부
		}
		// if(){}else{} 문을 이용하여
		//숫자를 입력받아 그 숫자가 짝수인지 홀수인지 콘솔에 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		int num = Integer.parseInt(inputData);
		if( num % 2 == 1 ) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		if( num >= 50) {
			System.out.println("50보다 큽니다.");
		}else {
			System.out.println("50보다 작습니다");
		}
		
		if(num == 50) {
			System.out.println("50입니다.");
		}else {
			System.out.println("50이 아닙니다");
		}
		
		
		
		
		
	}
}
