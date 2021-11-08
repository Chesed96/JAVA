package pack05_Escape;

import java.util.Scanner;

public class Ex03_ScannerTest {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		String inputData1 , inputData2, inputData3 ;
		inputData1 = ab.nextLine();
		inputData2 = ab.nextLine();
		inputData3 = ab.nextLine();
		System.out.println(inputData1);
		System.out.println(inputData2);
		System.out.println(inputData3);
		
		int i = 123;
		System.out.println("" + i);
		
		double d = 0.13;
		System.out.println("" + d);
		
		boolean t = true;
		boolean f = false;
		System.out.println("" + t);
		System.out.println("" + f);
		
		

	}
}