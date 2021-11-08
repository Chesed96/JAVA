import java.awt.Toolkit;

public class Ex04_ThreadTest2Main {
	public static void main(String[] args) {
		Thread thread = new Ex04_ThreadTest2();
		thread.start();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1000 1초. 
			System.out.println("동작함");
		}
	}
}
