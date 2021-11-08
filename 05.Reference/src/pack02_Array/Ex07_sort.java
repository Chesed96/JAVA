package pack02_Array;

public class Ex07_sort {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp = 0;
		System.out.println("변경 전 : a의 값 : " + a + ", b의 값 : "+ b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("변경 후 : a의 값 : " + a + ", b의 값 : "+ b);
		
		//swap
		//a 와 b에 직접 값을 할당하지 않고 두 수의 값을 바꿔보세요. (변수 사용은 가능)
		
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6};
		int[] arr3= arr1;
		/*	int[] arr3= {};    2개를 합친게 윗 줄 /선언과 초기화를 동시에
			arr3 = arr1;*/
		arr1 = arr2;
		arr2 = arr3;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " " + + arr2[i]);
		}
		
		
		
		
	}
}
