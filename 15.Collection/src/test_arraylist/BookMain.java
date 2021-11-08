package test_arraylist;

import java.util.ArrayList;

public class BookMain {
	public static void main(String[] args) {
		ArrayList<BookDTO> list = new ArrayList<>();
		
		list.add(new BookDTO("title1", "pub1", 1000, 1, "wirte1"));
		list.add(new BookDTO("title2", "pub2", 2000, 2, "wirte2"));
		list.add(new BookDTO("title3", "pub3", 3000, 3, "wirte3"));
		list.add(new BookDTO("title4", "pub4", 4000, 4, "wirte4"));
		list.add(new BookDTO("title5", "pub5", 5000, 5, "wirte5"));
		
		BookDAO dao = new BookDAO();
		dao.getDisplay(list);
		
		
	}
}
