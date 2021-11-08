package test_arraylist;

import java.util.ArrayList;

public class BookDAO {
	
	void getDisplay(ArrayList<BookDTO> list) {
		System.out.println("제목\t출판사\t가격\t수량\t저자");
	for(BookDTO blist : list) {
		System.out.println(blist.getTilte() + "\t"+ blist.getPub() + "\t"+ blist.getPrice()+ "\t" +blist.getCnt()+ "\t" + blist.getWirte());
	}
	}
	
	
}
