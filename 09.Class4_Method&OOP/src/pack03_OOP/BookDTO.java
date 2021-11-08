package pack03_OOP;

public class BookDTO {
	String title;
	int price;
	String write;
	String publisher;
	
	
	public BookDTO(String title, int price, String write, String publisher) {
		super();
		this.title = title;
		this.price = price;
		this.write = write;
		this.publisher = publisher;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getWrite() {
		return write;
	}
	public void setWrite(String write) {
		this.write = write;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	
	
}
