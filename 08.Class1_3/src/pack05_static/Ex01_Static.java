package pack05_static;

public class Ex01_Static {
	int x = 5;	// ← 인스턴스 멤버
	int y = 10;	// static이 안붙었으면 무조건 인스턴스 멤버다.
	static int z = 50;	//← static 멤버
	//static이 안붙었으면 무조건 인스턴스 멤버이다.
	//인스턴스 멤버에서 static멤버 접근이 자유롭게 가능하다.
	//static멤버에서 인스턴스 멤버로 변수에 자유롭게 접근이 불가능함.
	//static멤버가 먼저 메모리에 올라가야하는데 
	//인스턴스 멤버들은 인스턴스화(객체화) 되어있지 않으면 메모리에 올라갈 수 없기 때문에.
	public static void main(String[] args) {
//		System.out.println(x);	// ← 인스턴스화되지 않아서 에러!
		
		Ex01_Static es = new Ex01_Static();	
		System.out.println(es.x);			
		System.out.println(z);
	}
	void main2() {
		System.out.println(x);
		System.out.println(z);
	}
}
