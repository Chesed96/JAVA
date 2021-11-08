import java.util.Scanner;

public class Ex02_ScoreProgram {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] score = null; // 참조타입은 null로 초기화
		String[] student = null;

		System.out.println("시작합니다.");

		while (true) {
			System.out.println("1.학생수 입력 2.점수 입력 3.점수리스트 4.분석(평균) 5.종료");
			try {
				int menu = Integer.parseInt(sc.nextLine());
				if (menu == 1) {
					// 학생의 수를 입력받고 학생의 이름까지 입력하는 로직
					// +2차원 배열을 입력받은 학생의 수로 초기화 시켜줘야한다.
					System.out.println("학생의 수를 입력해세요.");
					// try{}catch while(true) 추가 가능
					int std_cnt = Integer.parseInt(sc.nextLine());
					student = new String[std_cnt];
					// 학생 n명의 정보를 입력받을 수 있다.
					// 1차원 배열 == for문 하나만 있어도 전체 index에 모두 접근이 가능하다.
					// 배열의 크기(array.length)
					for (int i = 0; i < student.length; i++) {
						System.out.println((i + 1) + "번째 학생의 이름을 입력해주세요.");
						student[i] = sc.nextLine();
					}
					score = new int[std_cnt][3];
				} else if (menu == 2) {
					if (student == null) {
						System.out.println("학생의 정보를 먼저 입력해주세요. 메뉴 1로 가세요.");
						continue;
					}
					for (int i = 0; i < score.length; i++) {
						System.out.println(student[i] + "의 점수를 입력해주세요.");
						for (int j = 0; j < score[i].length; j++) {
							System.out.println((j + 1) + "번 째 과목의 점수를 넣어주세요.");
							score[i][j] = Integer.parseInt(sc.nextLine());
							continue;
						}
					}
				} else if (menu == 3) {
					System.out.println("점수를 입력해주세요.");
					for (int i = 0; i < score.length; i++) {
						System.out.println(student[i] + "의 점수");
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + " ");

						}
						System.out.println();
					}

				} else if (menu == 4) {
					for (int i = 0; i < score.length; i++) {
						int sum = 0;

						for (int j = 0; j < score[i].length; j++) {
							sum += score[i][j];
						}
						System.out.println(student[i] + "번 째 학생의 평균 : " + (sum / 3));

					}
				} else if (menu == 5) {
					System.out.println("종료합니다.");
					break;
				} else {
					System.out.println("없는 메뉴입니다.");

				}
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다.");
			}

		}

	}
}
