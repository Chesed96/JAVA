package pack02_OutputStream;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex04_OutputString {
	public static void main(String[] args) throws IOException {
		//OutputStream os = System.out;
		//OutputStreamWriter osw = new OutputStreamWriter(os);
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		String str = "문자열을 입력 \n 줄바꿈";
		osw.write(str);
		osw.flush();
	}
}
