package pack04_OOP;

import java.util.Scanner;


public class JapangiMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cash = 0;
		int menu = 0;
		 
		 JapangiDTO[] dto = new JapangiDTO[3];
		 dto[0]	= new JapangiDTO(1,"콜라", 800, 8);
		 dto[1]	= new JapangiDTO(2,"사이다",1000, 5);
		 dto[2]	= new JapangiDTO(3,"환타", 900, 1);
		 
		 JapangiDAO dao = new JapangiDAO();
		 
		 
		 
		 
		 while(true) {
			 System.out.println("1.자판기 이용 , 2.관리자 기능 , -1.자판기 종료");
			 
			 menu = Integer.parseInt(sc.nextLine());
			 
			 if(menu == 1) {
				dao.display(dto);
				cash =  dao.displayCash(dto);
				dao.display(dto);
				cash = dao.displayDaw(dto, cash);
				
				dao.displayEnd(dto, cash);
				
			 }
			 if(menu == 2) {
				
				 if( dao.login(dto, null, null)) {
					 System.out.println("관리자 모드 입니다.");
					 System.out.println("0.목록 확인 1.추가 2.삭제 3.수정");
					 
				 }
				
			 }
			 if(menu == -1) {
				 System.out.println("프로그램을 종료합니다.");
				 break;
			 }
		 }
	
	
	
	
	
	
	
	
	}
}
