package pack01_InputStream;

public class ScannerMain {
	public static void main(String[] args) {
		
		KehScanner ks = new KehScanner(System.in);
		String inputData = ks.nextLine();
		System.out.println(inputData);
	}
	
}
