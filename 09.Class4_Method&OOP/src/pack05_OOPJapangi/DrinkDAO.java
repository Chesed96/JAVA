package pack05_OOPJapangi;

import java.util.Scanner;

public class DrinkDAO {
	Scanner sc = new Scanner(System.in);

	void menudisplay(DrinkDTO[] dtos) {
		for (int i = 0; i < dtos.length; i++) {
			System.out.print(dtos[i].getNumber());
			System.out.print("." + dtos[i].getName());
			System.out.print(" 금액 : " + dtos[i].getPrice());
			System.out.print("수량" + dtos[i].getCnt());
			System.out.println();
		}

	}

	DrinkDTO[] initDTOS() {
		DrinkDTO[] dtos = new DrinkDTO[3];
		// [ null ] [ null ] [ null ]
		// [ new dto] [new dto] [new dto]
		// DrinkDTO DrinkDTO DrinkDTO 가 들어가야함.
		// DrinkDTO dto = new DrinkDTO(param );
		// String[] arr = new String[3];
		// [null] [null] [null]
		// String String String
		// " " " " " "
		dtos[0] = new DrinkDTO(1, "콜라", 800, 8);
		dtos[1] = new DrinkDTO(2, "사이다", 1000, 5);
		dtos[2] = new DrinkDTO(3, "환타", 900, 1);
		return dtos;
	}

	String rtnString(String msg) {
		String sData = "";
		while (true) {
			try {
				System.out.println(msg);
				sData = sc.nextLine();
				if (sData.length() < 1) {
					System.out.println("한글자 이상 다시 입력하세요.");
				} else {
					return sData;
				}
			} catch (Exception e) {
				System.out.println("DrinkDAO_rtnString에러");
			}
		}
	}

	// 사용자가 10으로 나누어지는 (돈) 숫자를 입력할때까지 무한 반복하는 메소드
	int rtnMoney() {
		while (true) {
			int money = rtnInt("금액을 입력해주세요");
			if ((money % 10) == 0) {
				return money;
			} else {
				System.out.println("금액을 올바르게 입력 해주세요.");
				System.out.println("입력하신 금액 : " + money);

			}
		}
	}

	// 사용자가 숫자를 입력할때까지 반복하는 메소드. (※반드시 int값을 반환한다.)
	// + String타입의 데이터를 받아서 그 데이터를 먼저 사용자에게 보여주고
	int rtnInt(String msg) {
		int iData = 0;
		while (true) {
			try {
				System.out.println(msg);
				iData = Integer.parseInt(sc.nextLine());
				return iData;
			} catch (Exception e) {
				System.out.println("숫자값만 입력이 가능합니다.");
			}

		}
	}

	int rtnInt() {
		int iData = 0;
		while (true) {
			try {
				iData = Integer.parseInt(sc.nextLine());
				return iData;
			} catch (Exception e) {
				System.out.println("숫자값만 입력이 가능합니다.");
			}

		}
	}

	int drinkBuy(int money, int choice, DrinkDTO[] dtos) {
		boolean isChecked = false;
		for (int i = 0; i < dtos.length; i++) {
			if (choice == dtos[i].getNumber()) {
				System.out.println(dtos[i].getName() + "선택됨");
				isChecked = true;
				choice = i;
				break;
			}
		}
		if (isChecked) {
			// 실제 음료를 사용자가 구매하는 로직을 추가
			if (money < dtos[choice].getPrice()) {
				System.out.println("금액이 부족합니다.");
				return money;
			}
			if (dtos[choice].getCnt() < 1) {
				System.out.println("음료의 수량이 부족합니다.");
				return money;
			}
			money = money - dtos[choice].getPrice();
			System.out.println("선택하신 음료를 배출합니다." + dtos[choice].getName() + "배출 완료");
			return money;
		} else {
			System.out.println("선택하신 메뉴는 없는 메뉴입니다.");
			return money;
		}

	}

	boolean adminLogin() {
		System.out.println("관리자 모드");
		System.out.println("관리자 인증을 먼저 진행 해야 합니다.");
		System.out.println("아이디를 입력해주세요.");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		String pw = sc.nextLine();
		if (id.equals("master") && pw.equals("admin")) {
			return true;
		} else {
			return false;
		}
	}

	DrinkDTO[] addDrink(DrinkDTO[] dtos) {
		// [콜라] [사이다] [환타] [음료4] +1
		// [콜라] [사이다] [환타] [null] [ ] [ ]
		DrinkDTO[] tempDtos = new DrinkDTO[dtos.length + 1];
		for (int i = 0; i < dtos.length; i++) {// 3번 반복하는 for
			tempDtos[i] = dtos[i];
		}
		tempDtos[tempDtos.length - 1] = new DrinkDTO(rtnInt("음료의 번호를 입력하세요"), // number
				rtnString("음료의 이름을 입력하세요."), // name
				rtnInt("음료의 가격을 입력해주세요."), // price
				rtnInt("음료의 수량을 입력해주세요.")); // cnt

		return tempDtos;
	}

	DrinkDTO[] modifyDrink(DrinkDTO[] dtos) {
		// [콜라] [사이다] [환타] [음료4]
		// [콜라] [사이다] [환타] [음료4]
		menudisplay(dtos);
		int choice = rtnInt("수정하실 음료의 번호를 선택해주세요.");
		for (int i = 0; i < dtos.length; i++) {
			if (choice == dtos[i].getNumber()) {
				choice = i;
				System.out.println(dtos[i].getName() + "음료의 정보를 수정합니다.");
				break;
			}
		}
		dtos[choice].setName(rtnString("수정하실 음료의 이름을 적어주세요."));
		dtos[choice].setPrice(rtnInt("수정하실 음료의 가격을 적어주세요."));
		dtos[choice].setCnt(rtnInt("수정하실 음료의 수량을 적어주세요."));

		return dtos;
	}

	public DrinkDTO[] deleteDrink(DrinkDTO[] dtos) {
		// [콜라] [사이다] [환타]
		// [ ] [ ]
		DrinkDTO[] tempDtos = new DrinkDTO[dtos.length - 1];
		menudisplay(dtos);
		int choice = rtnInt("삭제하실 음료의 번호를 선택해주세요.");
		for (int i = 0; i < dtos.length; i++) {
			if(choice == dtos[i].getNumber()) {
				dtos[i] = null ;
				System.out.println("삭제 되었습니다.");
			}
		}
		for (int i = 0; i < dtos.length; i++) {//3번 반복
			if(dtos[i] != null) {
				tempDtos[i]  = dtos[i];
			}
		}
		return tempDtos;
	}

}
