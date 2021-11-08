package pack02_Array;

public class Ex02_Array {
	public static void main(String[] args) {
		//int[] array;				int a;
		//array = new int[3];		a = 10;
		//초기화 ? 선언과 할당을 동시에 하는 것.
		//1. 배열의 초기화 식( 변수의 초기화 식 : int a =10;)
		//크기 할당까지만 초기화함. (변수의 기본값을 가지고 있는 상태로 만듬)
		
		int[] array = new int[3];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		//2.배열의 초기화 식
		//String배열을 이용해도 null 값을 회피할 수 있다.
		//String[] array2 = {"0번", "1번", "2번" } ;
		
		//세 숫자의 총합과 세 숫자의 평균을 구하시오.(출력)
		System.out.println("세 숫자의 총합 : " + (array[0] + array[1] + array[2]));
		System.out.println("세 숫자의 평균 : " + ((array[0] + array[1] + array[2])/3));
		
		
		
		
		
		
	}
}
