import java.util.Random;
import java.util.Scanner;

public class Ex01_NumberGame {
	public static void main(String[] args) {
		// 배열, 반복문, 조건문, Random, Scanner
		// 스캐너를 통해서 콘솔창에 입력을 받는 프로그램이다.
		// 1.난이도를 입력해주세요 1~ 아무 '숫자'나 가능
		// 숫자 이외의 값이 들어오면 사용자에게 값을 다시 입력받는다.
		// 2.배열을 만든다 (배열의 크기는 사용자가 입력한만큼의 크기를 가진다.)
		// 3.random.nextint(사용자가 입력한 만큼의 범위) +1
		// 배열에 랜덤한 index에 숫자를 숨긴다.
		// 4.게임을 시작한다.
		// 사용자는 숫자를 입력해서 랜덤하게 숨겨놓은 index의 주소를 맞추는 게임.
		// 사용자가 index의 주소를 맞추지 못한 경우에는 다시 입력을 받음.

		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				int i = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
			int i = Integer.parseInt(sc.nextLine()); //사용자가 숫자 입력을 완료함(난이도)
			int[] arr = new int[i]; // 사용자가 입력한 값을 이용해서 배열을 만듬.
			Random random = new Random();
			int com = random.nextInt(i);
			while (true) { // 사용자가 답을 맞출 때까지 반복하는 (횟수에 정함이 없음.)
				int j = Integer.parseInt(sc.nextLine());
				if (com == j) {
					System.out.println("정답입니다.");
				} else {
					System.out.println("틀렸습니다.");
				}
			}
		}

		
		
		
	}
}
