package pack01_TryCatch;

public class Ex05_TryCatchUser {
	public static void main(String[] args) {
		//1부터 100까지 누적합(sum)
		//단, 누적 합이 777 이상이 되면, 계산을 중지하고 결과를 출력.
		//throw : 강제로 예외를 발생시켜 catch 블럭으로 이동시킨다. (던진다=넘긴다)
		
		int sum = 0;
		try {
			//오류가 발생하지 않는 코드를 try에서 실행시킴.
			//특정한 상황에서 일부러(억지로)강제로 예외를 개발자가 발생시킴.
			for (int i=1; i<=100; i++) {
				sum += i;
				if(sum >= 777) {
					//오류는 아니지만 특정한 상황을 가정함.
					throw new Exception("누적합이 777이상이 됨..." + sum);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		}				
	}

