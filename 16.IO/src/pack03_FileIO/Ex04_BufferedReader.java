package pack03_FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex04_BufferedReader {
	public static void main(String[] args) throws IOException {
//		Reader reader = new FileReader("D:\\Study_Java\\IO_FORDER\\Ex03_File.txt");
//		BufferedReader br = new BufferedReader(reader);
		BufferedReader br = new BufferedReader(new FileReader("D:\\Study_Java\\IO_FORDER\\Ex03_File.txt"));
		while(true) {
			String data = br.readLine();//데이터를 한 줄씩 읽어옴.
			if(data == null) {
				break;
			}
			System.out.println(data);
		}
	}
}
