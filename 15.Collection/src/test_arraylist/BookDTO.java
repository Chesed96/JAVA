package test_arraylist;

public class BookDTO {

	private String tilte;
	private String pub;
	private int price;
	private int cnt;
	private String wirte;
	
	
	public BookDTO(String tilte, String pub, int price, int cnt, String wirte) {
		super();
		this.tilte = tilte;
		this.pub = pub;
		this.price = price;
		this.cnt = cnt;
		this.wirte = wirte;
	}
	
	
	public String getTilte() {
		return tilte;
	}
	public void setTilte(String tilte) {
		this.tilte = tilte;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getWirte() {
		return wirte;
	}
	public void setWirte(String wirte) {
		this.wirte = wirte;
	}
	
	
	
}
