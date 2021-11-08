package pack03_OOP;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		
		BookDTO[ ] dtos = new BookDTO[3];	//BookDTO를 3칸짜리 배열로 인스턴스화
		dtos[0] = new BookDTO("title1", 1000, "write1", "publisher1");
		dtos[1] = new BookDTO("title2", 2000, "write2", "publisher2");
		dtos[2] = new BookDTO("title3", 3000, "write3", "publisher3");
		
		/*for(int i=0; i<dtos.length; i++) {
			System.out.println(dtos[i].getTitle() +"\t"+ dtos[i].getPrice()+"\t"+ dtos[i].getWrite()+"\t"+ dtos[i].getPublisher());
		}
		*/
		
		
		BookDAO dao = new BookDAO();	//인스턴스화
		dao.display(dtos);
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 책 제목을 입력해주세요.");
		dao.displayInput(dtos,sc.nextLine());
		
		
	}
}
