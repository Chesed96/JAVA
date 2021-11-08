package pack01_InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KehScanner {
	
	private BufferedReader br; // null → new
	//Thread d = new Thread()
	//InputStream in = System.in;
	public KehScanner(InputStream in)  {
		this.br = new BufferedReader(new InputStreamReader(in));
		
	}
	//void냐 	void가 아니냐?
	//리턴없음	리턴있음.
	public String nextLine() {
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	
	
		
	
	
}
