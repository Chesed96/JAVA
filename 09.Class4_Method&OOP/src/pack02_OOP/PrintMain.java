package pack02_OOP;
//호출, 보내 줄 값을 넣어줌(변수 넣을 수 없음).
public class PrintMain {
	public static void main(String[] args) {
		//인스턴스화를 절대하지 말 것.(static)
		PrinterKEH.println(false);
		PrinterKEH.println(10);
		PrinterKEH.println("KEH");
		PrinterKEH.println(60.0);

		String[] arr = new String[3];
		PrinterKEH.println(arr);
	}
}
