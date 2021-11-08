import java.util.Scanner;

public class Ex03_ScoreProgram {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] score = null;
		String[] student = null;
		String[] subject = { "국어", "영어", "수학", "과학" };

		while (true) {
			System.out.println("1.학생 수 입력 2.점수 입력 3.점수 리스트 4.분석 5.종료");
			try {
				int menu = Integer.parseInt(sc.nextLine());
				if (menu == 1) {
					System.out.println("학생의 수를 입력하세요.");
					int std_cnt = Integer.parseInt(sc.nextLine());
					student = new String[std_cnt];
					for (int i = 0; i < student.length; i++) {
						System.out.println((i + 1) + "번 째 학생의 이름을 입력하세요.");
						student[i] = sc.nextLine();
					}
					score = new int[std_cnt][subject.length + 1];
				} else if (menu == 2) {
					if (student == null) {
						System.out.println("학생의 정보를 먼저 입력하세요. 메뉴 1을 선택하세요.");
						continue;
					}
					for (int i = 0; i < score.length; i++) {
						System.out.println(student[i] + "의 점수를 입력해주세요.");
						for (int j = 0; j < score[i].length - 1; j++) {
							System.out.println(subject[j] + "과목의 점수를 넣어주세요.");
							score[i][j] = Integer.parseInt(sc.nextLine());
							score[i][score[i].length - 1] += score[i][j];
						}
					}

				} else if (menu == 3) {
					for (int i = 0; i < score.length; i++) {
						System.out.println(student[i] + "의 점수");
						for (int j = 0; j < score[i].length - 1; j++) {
							System.out.print(score[i][j] + " ");

						}
						System.out.println();
					}

				} else if (menu == 4) {
					for (int i = 0; i < score.length; i++) {

						System.out.println(student[i] + "의 점수");
						for (int j = 0; j < score[i].length - 1; j++) {
							System.out.println(subject[j] + " 점수 : " + score[i][j]);
							
						}

						System.out.println(student[i] + "총점 : " + (score[i][score[i].length - 1]));
						System.out.println(student[i] + "평균 : " + (score[i][score[i].length - 1] / subject.length));
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
