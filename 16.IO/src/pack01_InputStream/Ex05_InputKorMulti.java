package pack01_InputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_InputKorMulti {
	public static void main(String[] args) {
		//InputStreamReader isr이라는 이름으로 초기화 시키기.
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("한글 여러 글자를 입력해주세요.");
		try {
			int data;
			while((data = isr.read()) !=-1){
				if(data != 13 && data != 10) {
					System.out.println("입력하신 문자는 " + (char)data + " 입니다.");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
