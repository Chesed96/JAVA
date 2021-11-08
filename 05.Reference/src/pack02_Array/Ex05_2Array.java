package pack02_Array;

public class Ex05_2Array {
	public static void main(String[] args) {
		//2차원배열은 요소로(구성) 1차원 배열을 가지고 있다.
		//1차원배열은 값(데이터타입)을 요소로 가지고 있다.
		//int[] arr = { 1 , 2, 3, 4};
		//2차원 배열에 크기할당과 동시에 값을 할당하는 방법
		int[][] arr = {
				{1,2},
				{3,4,5},
				{6,7,8,9},
				{10,11,12,13,14}
				};
		System.out.println(arr.length); // 총 행의 갯수를 출력
		System.out.println(arr[0].length); //0번째에 요소로 있는 1차원 배열의 크기(열크기)
		System.out.println(arr[3].length);
	
	System.out.println("===========");
		
		//arr <2차원 배열의 모든 내용을 for문을 통해서 출력해보세요.
		//ex) 모든 행에 접근하는 for
		//		모든 열에 접근하는 for
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
		}
	}

