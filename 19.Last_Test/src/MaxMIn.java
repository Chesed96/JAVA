
public class MaxMIn {
	public static void main(String[] args) {
		int[] arr = {50, 100, -70, 20, 25, 80, 225, 42, -100, 72};
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} 
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최대 값 = " + max);
		System.out.println("최소 값 = " + min);
	}
}

