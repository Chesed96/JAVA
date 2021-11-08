package pack03_for;

public class Ex02_for_for {
	public static void main(String[] args) {
		//for문 1개가 1차원이라고 하면 for문이 하난씩 내부에 증가할 때마다 차원을 증가하는 개념
		//ex) for1)excel columns 또는 rows접근 둘 중 하나만 접근(행 또는 열) 1차원
		//ex) for2)excel columns 과 row 두개 다 접근을 함(행열 구조) 2차원
		//ex) for3)excel columns 과 row + sheet의 개념 3차원
		//프로그램을 짰는데 for문이 3개 이상 사용되었다면 로직을 검토해 볼 필요가 있다.
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			for(int j = 0; j<10; j++) {
				System.out.println(j);
			}
		}//for1
		System.out.println("=====");
		//구구단을 출력하시오.(중첩 for문을 이용해서)
		//1~9단까지 출력.
		//1*1=1...1*9;
		//2*1=2...2*9;
		//3*1=3...3*9;
		//syso( i + "*" + j + "=" + (i*j) )
		
		for(int i = 1; i<10; i++) {
			System.out.println(i + "단");
			for(int j = 1; j<10; j++)
				System.out.println(i + "*" + j + "=" + (i*j));
		}
		
		
		
		
	}
}
