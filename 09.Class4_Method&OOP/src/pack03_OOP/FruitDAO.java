package pack03_OOP;

import java.util.Arrays;

public class FruitDAO {

	void display(FruitDTO[] dtos) {
		System.out.println("이름\t가격\t수량\t원산지");
		for(int i=0; i<dtos.length; i++) {
			System.out.println(dtos[i].getName() + "\t" + dtos[i].getPrice() +"\t" + dtos[i].getPiece() +"\t" + dtos[i].getFrom());
		}
	}
	
	void displayMax(FruitDTO[] dtos) {
		int max = dtos[0].price;
		for(int i=0; i<dtos.length; i++) {
			if(max<dtos[i].price) {
				max=dtos[i].price;
			}
		}
		System.out.println("가격이 제일 높은 과일" + max);
		for(int i = 0; i<dtos.length; i++) {
			if(dtos[i].price == max) {
				System.out.println(dtos[i].getName() + "\t" + dtos[i].getPrice() +"\t" + dtos[i].getPiece() +"\t" + dtos[i].getFrom());
			}
		}
	}

	void displayUpper(FruitDTO[] dtos) {
		for(int i=0; i<dtos.length; i++) {
			for(int j=0; j<dtos.length-1; j++) {
				if(dtos[j].price > dtos[j+1].price) {
					int temp = dtos[j].price;
					dtos[j].piece=dtos[j+1].price;
					dtos[j+1].price=temp;
				}
			}
		}
		System.out.println("가격의 오름차순");
	}







}
