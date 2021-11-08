import java.awt.Toolkit;

public class EX02_BeepTasckMain {
	public static void main(String[] args) {
		//Thread가 작업을 할 수 있는 Runnable을 상속받은
		//객체(class)를 Thread작업으로 넣어줄 수 있다.
		Runnable beep_task = new Ex02_BeeptTask();
		Thread thread = new Thread(beep_task);
		thread.start();
		System.out.println("테스크가 동작 중");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1000 = 1초.
			System.out.println("???");
		}
	}
}
