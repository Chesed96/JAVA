package pack04_while;

public class Ex04_Dowhile {
	public static void main(String[] args) {
		//별로 안 중요함. 사용빈도 극히 낮음. (float, long)
		//		do {
		//			1. 실행부 ; 무조건 한번 실행 됨.
		//		}while(2.조건식); 실행부를 반드시 한 번 실행한 다음 조건식
		
		//
		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		}while(i<=10);
		System.out.println(sum);
		
	}
}
