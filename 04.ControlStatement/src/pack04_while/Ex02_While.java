package pack04_while;

public class Ex02_While {
	public static void main(String[] args) {
		//1.초기값(조건식의 기준이 되는 값)
		//2.조건식
		//3.증감식
		//1~100까지의 수중에 (정수, 숫자형) int
		//홀수만 콘솔창에 출력하세요.
		//방법1. while문 내부에 if문을 사용해야한다.
		//방법2. while문의 증감식이 조금 변경되어야한다.
		
		//while(조건식) { ←  블럭킹 →}
		//방법 1
		int i = 1;
		while(i<=100) {
			if(i%2 == 1) {
				System.out.println(i);
			}
				i++;
		}
		
		//방법 2
//		int i = 1;
//		while(i<=100) {
//      System.out.println(i);
//		}
//       i += 2  ;
		
		
		
		}
	}

