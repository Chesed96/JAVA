package pack02_Array;

public class Ex04_2Array {
	public static void main(String[] args) {
		//1차원 배열 3 : [] [] []
		//2차월 배열 3 : 1[0] [1] [2] 
		//				 0[0] [1] [2]
		//2차원 배열의 선언하는 방법 : 데이터 타입 [][] 배열의 이름;
		int[][] arr; // ← int형 2차원 배열선언
		arr = new int[2][3];// 행 * 열 = 6, [4][3] = 12
		System.out.println(arr.length); //행의 크기 조회
		System.out.println(arr[0].length); // 열의 크기 조회
		System.out.println(arr[1].length); // 열의 크기 조회
		System.out.println(arr[0][0]); 		// [0][0] 의 값

	System.out.println("===========");
		
		//2차원 배열에 값을 할당.
		arr[0][0] = 1; // 1[4][5][6]
		arr[0][1] = 2; // 0[1][2][3]
		arr[0][2] = 3; //
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		//for == 1 차원배열 끝까지 접근이 가능했다.
		//ex)1차원 배열 < > for length (1차원 배열의 크기)
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i][i]);
		}

		System.out.println("===========");
	
		//for문을 두개 사용해서 2차원 배열의 모든 값을 콘솔창에 출력
		for(int x=0; x<2; x++) { // 모든 행의 접근(모든 1차원 배열에 접근)
			for(int y=0; y<arr[x].length; y++) { // 모든 열에 접근(조건식에 1차원 배열의 열의 크기를 지정해 놓는다.)
				System.out.println(arr[x][y]);
			}
		}
		
		
		
		
	}
}
