package pack02_OutputStream;

import java.io.IOException;
import java.io.OutputStream;

public class Ex02_OutputSingle {
	public static void main(String[] args) {
		OutputStream os = System.out;
		try {
			os.write(65);	//OutputStream Buffer라는 데이터 저장 개념에 데이터를 쌓아 두기만한 상태
			os.flush();		// ← System.out.prlintln("데이터의 flush")
							// ← System.otu.print('write')
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
