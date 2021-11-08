package pack02_OutputStream;

public class Ex01_SystemOut {
	public static void main(String[] args) {
		System.out.write(65);
		System.out.flush();
		//스트림 버퍼에 저장되어 있는 데이터를 강제적으로 출력시킵니다.
		//기본적으로 출력 스트림은 버퍼에 데이터가 가득 차면 그 때 데이터를 출력시키는데
		//이 메소드를 사용하면 저장도니 데이터의 크기와 상관없이 전체를 강제적으로 출력한다.
	}
}
