package pack01_TryCatch;

import java.util.Scanner;

public class Ex02_TryCatch {
	public static void main(String[] args) {
		//숫자를 입력하면 문자를 입력하세요. 라고 출력되는 프로그램을 만든세요.
		//Ex01 ← 숫자 만 입력할수 있는 프로그램
		//Ex02 ← 문자열 만 입력할수 있는 프로그램
		//1을 입력하면 문자를 입력하세요.
		//문자를 입력하면 잘 입력되었습니다.
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				String inputData = sc.nextLine();
				int num  = Integer.parseInt(inputData);
				System.out.println("잘못입력하셨습니다.");
				if(num == -1) {
					break;
				}
			}catch (Exception e) {
				System.out.println("잘입력하셨습니다.");
			}
			
		}
	
		
		
		
		
		
	}
}
