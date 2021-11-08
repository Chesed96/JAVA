package pack01_String;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		//ex) str1(keh) == str2(keh)
		Scanner sc = new Scanner(System.in);
		String str1 = "keh";
		String str2 = "keh";
		String str3 = sc.nextLine();
		String str4 = new String("keh");
		if(str1 == str2) {//String 변수의 참조 주소가 같은지를 물어보는 것.
			System.out.println("str1, str2 참조가 같음");
		}
		if(str1.equals(str3)) { //String변수의 실제 힙영역의 값을 비교
			System.out.println("str1, str3 값이 같음.");
		}
		if(str1.equals(str4)) {
			System.out.println("str1, str4 값이 다름");
		}
		//String의 참조를 비교하는 경우는 거의 없다.
		//String의 실제 값(힙영역) 비교할 때는 equals를 사용한다.
		//외부에서 들어오는 값(콘솔Scanner, Html, DataBase)들은 전부 new라는 키워드가 붙어서 새로운 힙영역을 준비한다고 이해하면 된다.
		
		
		
		
		
	}
}
