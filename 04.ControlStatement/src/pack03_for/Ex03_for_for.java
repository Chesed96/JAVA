package pack03_for;

public class Ex03_for_for {
	public static void main(String[] args) {
		//문제1) 1~10까지의 누적합(sum)을 구하시오.
		//sum ← 변수의 위치가 어디에 있어야할까?
		//누적 : sum = sum + 어떤 값; == sum +=어떤 값;
		//for문 내부에 변수를 선언하면 계속해서 선언이 됨.
		
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
			System.out.println(i);
			System.out.println("sum : " + sum);
		}
		System.out.println("=====");
	
		//문제2)
		//for(){ i는 계속 1씩 증가함.
		//for (조건식이 변하고 있음 0~1, 1~2, 1~3,...)
		//}
		//★
		//★★
		//★★★
		//★★★★
		//★★★★★
		//조건식이 바뀌고 있다. 1번
		//						2번
		
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("★");
		}
		System.out.println();
		}
		
		
	}
}
