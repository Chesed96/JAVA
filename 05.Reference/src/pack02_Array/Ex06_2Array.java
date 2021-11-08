package pack02_Array;

public class Ex06_2Array {
	public static void main(String[] args) {
		//2차원배열 == 1차원배열을 요소로 가진 배열이다.
		//1차원 배열을 별도로 만들어놓고 2차원배열에 넣을 수 있을까?
		int[] arr1 = new int[10];
		int[] arr2 = new int[8];
		int[] arr3 = new int[5];
		//2차원배열의 행의 크기만 지정하고 크기 할당을 끝낸다.
		//1[	1차원 배열	]
		//0[	1차원 배열	]
		int [][] arrs = new int[3][]; // 행의 크기만 지정해놓은 상태(1차원배열x)
		arrs[0] = arr1;
		arrs[1] = arr2;
		arrs[2] = arr3;

		for(int i=0; i<arrs.length; i++) { // 모든행에 접근
			for(int j=0; j<arrs[i].length; j++) { // 행에 들어있는 1차원 배열의 크기만큼 반복하는 for문
				System.out.print("★");
			}System.out.println();
		}
		
		
		
		
	}
}
