package pack01_List;

import java.util.List;
import java.util.Vector;

public class Ex03_Vevtor {
	public static void main(String[] args) {
		// 별로 안 중요함.
		List<BoardDTO> list = new Vector<>();
		//Vector<BoardDTO> vec = new Vector<>();
		list.add(new BoardDTO(1, "title1","content1"));//데이터 2건 add시키기
		list.add(new BoardDTO(2, "title2","content2"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNo() + "\t" +list.get(i).getTitle() + "\t"+ list.get(i).getContent());
		}
	}
}
