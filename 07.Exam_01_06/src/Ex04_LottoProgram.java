import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex04_LottoProgram {
	public static void main(String[] args) {

		Random r = new Random();
		int[][] userLotto = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.자동. 2.수동 -1.종료");
		while (true) {
			try {
				int menu = Integer.parseInt(sc.nextLine());
				if (menu == 1) {
					System.out.println("몇 개를 구입하시겠습니까?");
					int cnt = Integer.parseInt(sc.nextLine());
					userLotto = new int[cnt][6];
					for (int k = 0; k < cnt; k++) {
						int[] tempLotto = new int[6];
						for (int i = 0; i < tempLotto.length; i++) {
							tempLotto[i] = r.nextInt(45) + 1;
							for (int j = 0; j < i; j++) {
								if (tempLotto[i] == tempLotto[j]) {
									i = i - 1;
								}
							}
						}
						userLotto[k] = tempLotto;
					}
					for (int i = 0; i < userLotto.length; i++) {
						System.out.println(Arrays.toString(userLotto[i]));
					}

				} else if (menu == 2) {
					System.out.println("몇 개를 구입하시겠습니까?");
					int cnt = Integer.parseInt(sc.nextLine());
					userLotto = new int[cnt][6];
					for (int k = 0; k < cnt; k++) {
						int[] tempLotto = new int[6];
						for (int i = 0; i < tempLotto.length; i++) {
							System.out.println((i + 1) + "번째 숫자를 입력하세요.");
							tempLotto[i] = Integer.parseInt(sc.nextLine());
							if (1 > tempLotto[i] || tempLotto[i] > 45) {
								System.out.println("1~45까지의 수를 입력해주세요.");
								i = i - 1;
								continue;
							}
							for (int j = 0; j < i; j++) {
								if (tempLotto[i] == tempLotto[j]) {
									System.out.println("번째와 중복된 숫자입니다.");
									i = i - 1;
								}
							}
						}
						userLotto[k] = tempLotto;
					}
					for (int i = 0; i < userLotto.length; i++) {
						System.out.println(Arrays.toString(userLotto[i]));
					}

				} else if (menu == -1) {
					System.out.println("로또 프로그램을 종료합니다.");
					break;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}

	}
}