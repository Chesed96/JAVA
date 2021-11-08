package pack06_game;

import java.util.Scanner;

public class Ex03_MultiplicationTable {
	public static void main(String[] args) {
		
		//문제1) 구구단을 가로로 출력
		int i =1;
		while(i<10) {
			for(int j = 1; j<10; j++)
				System.out.print(i + "*" + j+ "=" + (i*j) + "  " );
				System.out.println("");
				i++;
		}	
		
System.out.println("========================================================================================");
		
		//문제2) 구구단을 세로로 출력
		for(int x=1; x<10; x++) {
			for(int y=1; y<10; y++)
				System.out.print(y + "*" + x + "=" + (y*x) + "  ");
				System.out.println();
		}
		
		/*	int x =1;
			while(x<10) {
				for(int y = 1; y<10; y++)
					System.out.print(y + "*" + x + "=" + (y*x) + "  " );
					System.out.println("");
					x++;
		}	*/
		
System.out.println("========================================================================================");
				
		//문제3) 입력한 값의 구구단 출력
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		for(int c = Integer.parseInt(inputData); c <= Integer.parseInt(inputData); c++) {
			System.out.println(c + "단");
			for(int d=1; d<10; d++) {
				System.out.println(c + "*" + d + "=" + (c*d) + "  ");
			}
		}
		
System.out.println("========================================================================================");	
		
		//문제4)while문 만을 이용해서 구구단 출력
		int e = 1;
		while(e<10) {
			int f = 1;
			while(f<10) {
				System.out.print(e + "*" + f + "=" + (e*f) +"  ");
				f++;				
			}e++;
			System.out.println("");
		}
		
System.out.println("========================================================================================");	

		




	}
}
