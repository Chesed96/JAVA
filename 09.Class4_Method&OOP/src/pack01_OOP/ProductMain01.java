package pack01_OOP;

import java.util.jar.Attributes.Name;

public class ProductMain01 {
	public static void main(String[] args) {
		//Product객체를 인스턴스화 해서 속성을 준다.
		//num : 1 name : 컴퓨터
		//num : 2 name : 노트북
		//num : 3 name : 프린터
		//출력해보기
		
		Product p1 = new Product();
		p1.num = 1;
		p1.name ="컴퓨터";
		p1.display();
		
		Product p2 = new Product();
		p2.num = 2;
		p2.name ="노트북";
		p2.display();
		
		Product p3 = new Product();
		p3.num = 3;
		p3.name ="프린터";
		p3.display();
	}
}
