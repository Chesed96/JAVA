
public class Ex05_ThreadNameA extends Thread{
	public Ex05_ThreadNameA() {
		setName("ThreadA");
	}
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "←나의 이름");
		}
		super.run();
	}
}
