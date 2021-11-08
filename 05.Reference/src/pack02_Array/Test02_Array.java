package pack02_Array;

import java.util.Arrays;

public class Test02_Array {
	public static void main(String[] args) {
		//문제 1. int[] arr = {1,4,6,9,8,5,2,7,3}
		//홀수의 합과 짝수의 합을 구해서 출력하시오.
		//홀수 %2 == 1
		//제어문을 사용해서 출력하시오.
		int oddsum = 0;
		int evensum = 0;
		int[] arr =  {1,4,6,9,8,5,2,7,3};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 1) { 
				oddsum += arr[i];
			}
			if (arr[i]%2 == 0) {
				evensum +=arr[i];
			}
		}System.out.println("홀수의 합 : " + oddsum);
		 System.out.println("짝수의 합 : " + evensum);
		
		//문제 2. arr를 정렬하시오.{1,2,3,4,5,6,7,8,9}
		 for(int i=0; i<arr.length; i++) {
			 for(int j=i+1; j<arr.length; j++) {
				 if(arr[i] > arr[j]) {
					 int temp = arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 System.out.println(Arrays.toString(arr));
		 
		 
		 
	}
}
