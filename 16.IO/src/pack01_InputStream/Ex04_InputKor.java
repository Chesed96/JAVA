package pack01_InputStream;

import java.io.InputStreamReader;

public class Ex04_InputKor {
	//키보드에서 한글 1글자를 입력받아서 출력해보기
	public static void main(String[] args) {
		//InputStreamReader : 문자데이터(Uni Code)를 입력받는 스트림
		//InputStream : 바이트데이터 : ASCII, 이미지, 영상, 음원등을 입력받는 스트림
//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
		//↑ 위에 두 줄을 한줄로 만들어 보세요.
		//InputStreamReader isr = ?
		InputStreamReader isr = new InputStreamReader(System.in);
		//InputStream in = this.in = in;  ↑ 생성자 매소드
		try {
			int data = isr.read();
			System.out.println("입력하신 글자는 " + data + "입니다.");
			System.out.println("입력하신 글자는 변환해서 " + (char)data + " 입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
