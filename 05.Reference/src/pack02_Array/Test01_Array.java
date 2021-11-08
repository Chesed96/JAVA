package pack02_Array;

import java.util.Scanner;

public class Test01_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array;
		array = new int[3];
		/*int [] array= new int[3];*/
		for(int i = 0; i<array.length; i++) {
			array[i] = Integer.parseInt(sc.nextLine());
		System.out.println(i + "번 index : " + array[i]);
		}
		
		
		
	}
}
