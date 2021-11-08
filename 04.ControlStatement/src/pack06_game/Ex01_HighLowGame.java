package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Ex01_HighLowGame {
	public static void main(String[] args) {
		Random  random = new Random();
		int comNumber = random.nextInt(100)+1;// (값) 그값까지만 랜덤한 수를뽑음
		int userNumber = 0;
		int count = 0;
		//System.out.println(comNumber);
		Scanner sc = new Scanner(System.in);
		//1.coNumber라는 변수에는 1~100까지의 랜덤함 수가 저장이된다.
		//2.HighLow 게임을 구현
		//무한반복. 사용자가 입력(콘솔창에 입력)한 수가 comNumber와 같을 때까지
		//3.count라는 변수는 사용자가 답을 몇 번 입력했는지 체크한다.
		//4.comNuber == userNumber 가 같은면 게임을 종료하고
		//count가 몇 인지 출력을 한다.
		while (true) {
			count++;
			userNumber = Integer.parseInt(sc.nextLine());
			//  ↑ 같은 식	String InputData = sc.nextLine();
			//				userNumber = Integer.parseInt(InputData);

			if(userNumber > comNumber) {
				System.out.println("더 작은 수를 입력해주세요.");
				continue;
			}else if(userNumber < comNumber) {
				System.out.println("더 큰 수를 입력해주세요.");
				continue;
			}else {
				System.out.println("정답입니다.");
				
				//↑와 같은 식
				//	if (userNumber==comNumber) {
				//	break; } else {
				//		continue;} 
				//		System.out.println(count);*/
 				
				System.out.println("입력한 횟수 : " + count);
				break;
			}
			
		}
	
	
	
	}	
}

