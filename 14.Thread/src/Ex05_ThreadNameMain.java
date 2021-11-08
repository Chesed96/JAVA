
public class Ex05_ThreadNameMain {
	public static void main(String[] args) {
		Thread mainthread = Thread.currentThread();
		System.out.println("현재 스레드의 이름 : " + mainthread.getName());
		
		Ex05_ThreadNameA a = new Ex05_ThreadNameA();
		Ex05_ThreadNameB b  = new Ex05_ThreadNameB();
		
		System.out.println(a.getName());				
		System.out.println(b.getName());
		
		a.start();
		b.start();
	}
}
