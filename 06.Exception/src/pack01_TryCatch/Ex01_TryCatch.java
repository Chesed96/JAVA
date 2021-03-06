package pack01_TryCatch;

import java.util.Scanner;

public class Ex01_TryCatch {
	public static void main(String[] args) {
		//3개의 길이(크기) 정수형 배열을 만든다.
		//실제로 있지 않은 공간에 값을 할당해보자.(예외가 발생함)
		//try catch기능을 이용해 예외처리가 가능.
		//try 블럭은 시도를 한다. → 오류가 날 것같은 코드를 넣는다. (내코드가 되는지 안되는지 잘모르지만 실행을 함)
		//catch ← 예외가 발생한 순간 실행되는 부분(예외를 잡음)
		int[] arr = new int[3];
		try {
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[7] = 40;			
		}catch (Exception e) {
			System.out.println("배열인덱스에 잘 못 접근했습니다.");
		}
		// int number = 스캐너로부터 입력받은 값을 넣음.
		//입력은 계속해서 받는다.
		//단, 숫자외에 값이 입력되는 경우에는 사용자에게 "숫자값을 입력해주세요."라는 문구가 나온다.(콘솔)
		//-1값이 들어모녀 프로그램을 종료한다.
		//무한 루프, Integer(Wrapper Class).parsing
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				int number = Integer.parseInt(sc.nextLine()); 
				if(number==-1) {
					break;					
				}
			} catch (Exception e) {
			System.out.println("숫자값을 입력해주세요.");
			}
		}
		
		
		
		
		
		
		
		
	}
}
