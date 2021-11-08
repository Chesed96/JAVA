package pack03_OOP;

public class BookDAO {
	//BookDTO(클래스타입)을 배열구조로 가진 dtos를 for문으로 전부 보여줌.
	void display(BookDTO[] dtos) {
		System.out.println("제목\t가격\t저자\t출판사");
		for(int i=0; i<dtos.length; i++) {
			System.out.print(dtos[i].title + "\t");
			System.out.print(dtos[i].price + "\t");
			System.out.print(dtos[i].write + "\t");
			System.out.print(dtos[i].publisher + "\t");
			System.out.println();
		}
	}
	void displayInput(BookDTO[] dtos, String inputData) {
		
		System.out.println("사용자가 입력한 책");
		int count = 0;
		for(int i=0; i<dtos.length; i++) {
			if(dtos[i].getTitle().equals(inputData)) {
				count++;
				System.out.print(dtos[i].title + "\t");
				System.out.print(dtos[i].price + "\t");
				System.out.print(dtos[i].write + "\t");
				System.out.print(dtos[i].publisher + "\t");
				System.out.println();
			}
			}
			if(count == 0) {
				System.out.println("결과없음.");
			
		}
	}
}
