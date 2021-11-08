package pack01_Interface;
//Interface의 상속은 implements 라는 키워드를 통해서 한다.
//Interface를 상속받게되면 Interface멤버에 있는 메소드들을
//강제한다.
public class TestMain implements Testinterface{
	public static void mian(String[] args) {
		TestMain tm = new TestMain();
		tm.test1();
		tm.test2();
		tm.test3();
		System.out.println("서버연결로직" + SEVERIP);
	}
//	public static void main(String[] args) {
//		Testinterface ti = new Testinterface() {
//			
//			@Override
//			public void test2() {
//				System.out.println("test2");
//			}
//			@Override
//			public void test1() {				
//			}
//		};
//		ti.test2();
//	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}
}
