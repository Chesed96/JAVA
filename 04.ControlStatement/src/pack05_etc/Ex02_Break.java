package pack05_etc;

import java.util.Scanner;

public class Ex02_Break {
	public static void main(String[] args) {
		//스캐너. 콘솔창에 입력된 값을 가져와서 사용하기 위한.
		Scanner sc = new Scanner(System.in);
		while(true) {
			String inputData = sc.nextLine();
			if(inputData.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
				//문자열은 메모리에 저장되는 방식이 일반 변수와 다르다.(class)
				//따라서 문자열을 비교하기 위해서는 equals라는 함수를 사용해야만한다.
				
			}
			System.out.println("사용자가 입력한 값 : " + inputData);
		}
	}
}
