import java.awt.Toolkit;

public class Ex01_Thread {
	public static void main(String[] args) throws InterruptedException {
		//Window로부터 소리르 제공받는 API
		//패키지 java.awt.Toolkit;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			Thread.sleep(5000);//1000 = 1초.
			System.out.println("동작함");
		}
				
	}
}
