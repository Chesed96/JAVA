import java.util.Scanner;

public class Ex08_TestBool {
	public static void main(String[] args) {
		// Scanner를 통해서 숫자 두개를 입력받는다.
		// 입력된 값 두개가 같은지 다른지 true, false로 콘솔창에 출력하세요.

		// 1.sc nextLine() x 2 ☜ String → int (Integer == Wrapper Class)
		// 2.boolean

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		System.out.println("" + a + b);

		int c = Integer.parseInt(a); // a에 담긴 String → int c에 대입
		int d = Integer.parseInt(b); // b에 담긴 String → int d에 대입
		
														// true      false //
		System.out.println("c와 d가 같은지? " + (c == d ? "같다" : "다르다"));
		System.out.println("c와 d가 다른지? " + (c != d ? "다르다" : "같다"));
		System.out.println("c와 d중 c가 큰지(초과)? " + (c > d ? "네" : "아니오"));
		System.out.println("c와 d중 d가 큰지(초과)? " + (c < d ? "네" : "아니오"));
		System.out.println("c와 d중 d가 같거나 큰지?(이상) " + (c <= d ? "네" : "아니오"));
		
		if(c == d) {
			System.out.println("c 와 d같냐?");
		}
	}
}
