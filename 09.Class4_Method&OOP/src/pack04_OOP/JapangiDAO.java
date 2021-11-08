package pack04_OOP;

import java.util.Scanner;

public class JapangiDAO {

	Scanner sc = new Scanner(System.in);

	void display(JapangiDTO[] dto) {
		System.out.println("번호\t이름\t가격\t수량\t");
		for (int i = 0; i < dto.length; i++) {
			System.out.println(
					dto[i].getNum() + "\t" + dto[i].getName() + "\t" + dto[i].getPrice() + "\t" + dto[i].getCount());
		}
	}

	int displayCash(JapangiDTO[] dto) {
		int cash = 0;
		System.out.println("금액을 입력해주세요.");
		while (true) {
			cash = Integer.parseInt(sc.nextLine());
			if (cash >= 9) {
				try {
					if (cash / 10 == 0 || cash / 50 == 0 || cash / 100 == 0 || cash / 500 == 0 || cash / 1000 == 0) {
						System.out.println("입력하신 금액은 <" + cash + "원>입니다.");

					} else {
						System.out.println("금액을 다시 입력해주세요.");
					}
				} catch (Exception e) {
					System.out.println("동전과 지폐만 가능합니다.");
				}
			}
			return cash;

		}
	}

	int displayDaw(JapangiDTO[] dto, int cash) {
		System.out.println("음료의 번호를 입력해주세요.");

		while (true) {
			int bev = Integer.parseInt(sc.nextLine());
			bev = bev - 1;
			int income = 0;
			if (dto[bev].getPrice() > cash) {
				System.out.println("금액이 부족합니다.");
				System.out.println("금액을 더 넣어주세요.");
				income = Integer.parseInt(sc.nextLine());
				cash = cash + income;
				System.out.println("총 금액은 <" + cash + "원> 입니다.");
				System.out.println("음료의 번호를 입력해주세요.");
			} else {
				System.out.println(dto[bev].getName() + "를 몇 개 뽑으시겠습니까?");
				while (true) {
					try {
						int count;
						int n;
						n = Integer.parseInt(sc.nextLine());

						if (n <= dto[bev].getCount() && cash >= n * dto[bev].getPrice()) {
							System.out.println("선택하신 음료 " + dto[bev].getName() + n + "개를 뽑았습니다.");
							count = dto[bev].getCount() - n;

							dto[bev].setCount(count);
							cash = cash - n * dto[bev].getPrice();
							
							System.out.println(dto[bev].getName() + "의 남은 수량은 " + dto[bev].getCount() + "개 입니다.");
							System.out.println("남은 금액은 <" + cash + "원> 입니다.");
							return cash;
						} else if (n >= dto[bev].getCount()) {
							System.out.println("음료의 잔여 수량이 부족합니다.");
							System.out.println("뽑으실 음료의 수를 다시 입력해주세요.");
							continue;
						} 

					} catch (Exception e) {
						System.out.println("잘못된 입력입니다.");
					}

				}
			}
		}
	}

	void displayEnd (JapangiDTO[] dto, int cash) { 
		  while(true) {
			  int cheon = 0;
			  int oback = 0;
			  int back = 0;
			  int osib = 0;
			  int sib = 0;
			  
			  if(cash>1000) {
				  cheon = cash/1000;
				  cash = cash-(1000*cheon);
			  }
			  if(cash>500) {
				  oback = cash/500;
				  cash = cash-(500*oback);
			  }
			  if(cash>100) {
				  back = cash/100;
				  cash = cash-(100*back);
			  }
			  if(cash>50) {
				  osib = cash/50;
				  cash = cash-(50*osib);
			  }
			  if(cash>10) {
				  sib = cash/10;
				  cash = cash-(10*sib);
			  }
			  
			 System.out.println("천원 : "+ cheon + "개 를 반환합니다.");
			 System.out.println("오백원 : "+ oback + "개 를 반환합니다.");
			 System.out.println("백원 : "+ back + "개 를 반환합니다.");
			 System.out.println("오십원 : "+ osib + "개 를 반환합니다.");
			 System.out.println("십원 : "+ sib + "개 를 반환합니다.");
				  
			break;	  
		  } 
	}
	

	
	 boolean login(JapangiDTO[] dto, String id, String pw) {
		
		while(true) {
			System.out.println("ID와 PW를 입력해주세요.");
			
			id = sc.nextLine();
			pw = sc.nextLine();
			
			if(id.equals("master") && pw.equals("admin")) {
				System.out.println("로그인되었습니다.");
				return true;
				
			}
			else {
				System.out.println("잘 못 입력하셨습니다.");
				System.out.println("ID와PW를 확인해주세요.");
				return false;
			}
			
		}
		
	 }
	
	
	
	
	
	

}
