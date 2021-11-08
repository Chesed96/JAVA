package pack01_TryCatch;

public class Ex04_TryCatchOrder {
	public static void main(String[] args) {
		
		try {
			int a = 10/0;
			int[] arr = new int[3];
			arr[6] = 0; //예외처리가 필요함.
			
		} catch (ArrayIndexOutOfBoundsException e) {
			//배열의 인덱스 오류가 발생했을 때 처리하기 위한 코드
			System.out.println("인덱스 오류남.");
		}catch (Exception e) {
			//그 외의 오류가 발생했을 때 처리하기 위한 코드
			e.printStackTrace();
			//예외를 상세하게 출력(예외처리를 하지 않았을 때의 코드를 확인할 수 있습니다.)
			System.out.println("그 외의 오류");
		}
		
		
		
		
		
		
		
		
		
	}
}
