import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {

		UserDAO udao = new UserDAO();
		UserDTO udto = new UserDTO(0, null, null, null, null);

		NoticeDAO ndao = new NoticeDAO();

		Scanner sc = new Scanner(System.in);

		udao.getConn();

		int menu = 0;
		int menu2 = 0;

		while (true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1.로그인 2.회원가입 3.로그아웃 4.프로그램 종료.");
			menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				boolean isLogin = udao.login(udto);

				if (isLogin == true) {

					System.out.println("메뉴를 선택해주세요.");
					System.out.println("1.회원정보수정 2.회원탈퇴 3.공지사항 보기 ");
					menu2 = Integer.parseInt(sc.nextLine());

					if (menu2 == 1) {
						System.out.println("회원정보를 수정합니다.");

						boolean checkPw = udao.checkPw();
						if (checkPw == true) {
							udao.updateMember(udto);
						} else {
							System.out.println("잘못된 정보입니다.(수정X)");
						}
					} else if (menu2 == 2) {
						System.out.println("회원탈퇴를 합니다.");
						boolean checkPw = udao.checkPw();
						if (checkPw == true) {
							udao.deleteMember(udto);
						} else {
							System.out.println("잘못된 정보입니다.(탈퇴X)");
						}
					} else if (menu2 == 3) {
						System.out.println("공지사항보기");
						ArrayList<NoticeDTO> list = ndao.memberSelect();
						for (NoticeDTO ndto : list) {
							System.out.println(ndto.getId() + "\t" + ndto.getTitle() + "\t" + ndto.getContent() + "\t"
									+ ndto.getWriter());
						}
					}
				} else if(isLogin == false) {
					break;
				}
				else {
					System.out.println("없는 메뉴입니다.");
					continue;
				}
			} else if (menu == 2) {

				udao.insertMember();

			} else if (menu == 3) {
				boolean isLogin = udao.login(udto);
				if (isLogin == true) {
					System.out.println("로그아웃");
					break;
				} else {
					continue;
				}
			} else if (menu == 4) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} else {
				System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
				System.out.println(menu);
			}
		}
	}
}
