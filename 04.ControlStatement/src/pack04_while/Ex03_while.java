package pack04_while;

public class Ex03_while {
	public static void main(String[] args) {
		//while문만 사용해서
		////문제1) 1~10까지의 누적합(sum)을 구하시오.
		//sum ← 변수의 위치가 어디에 있어야할까?
		//누적 : sum = sum + 어떤 값; == sum +=어떤 값;
		
		int sum = 0;
		int i = 1;
		while (i<=10) {		
			sum += i;	
			i++;
		}
		System.out.println(sum);	
		
		System.out.println("==========");
		
		//문제2)	
		//for문을 중첩시켰다. → while 중첩
		//★
		//★★
		//★★★
		//★★★★
		//★★★★★

		int k =1;
		while(k<=5) {
			int j = 1;
			while(j<=k){
				System.out.print("★");
				j++;
			}
			k++;
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
