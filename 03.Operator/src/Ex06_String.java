
public class Ex06_String {
	public static void main(String[] args) {
		String str1 = "KEH" + 6.0;  // KEH6.0
		String str2 = str1 + "0128"; // KEH6.00128
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "문자열" + 3 + 6; // 문자열36
		String str3_1 = "문자열" + (3 + 6); // 문자열36
		String str4 = 3 + 6 + "문자열"; // 9문자열
		System.out.println(str3);
		System.out.println(str3_1);
		System.out.println(str4);
		
		
	}
}
