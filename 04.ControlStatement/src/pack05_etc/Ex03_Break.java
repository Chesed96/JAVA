package pack05_etc;

import java.util.Scanner;

public class Ex03_Break {
	public static void main(String[] args) {
		// Scanner를 사용해서 콘솔에 입력된 값을 계속해서 가져온다.
		// 단 입력은 테스트 시 숫자만 입력한다.
		// String을 int로 바꿔서 사용자가 입력한 값을 계속해서 누적해서 더한다.
		// 단, 사용자가 -1을 입력했을 때는 계산을 멈추고 프로그램을 종료한다.

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			String inputData = sc.nextLine();
			if (inputData.equals("-1")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			sum += Integer.parseInt(inputData);
			System.out.println("sum : " + sum);
		}

		
		
		
		
		
	}
}
