package pack03_OOP;

public class FruitDTO {

	String name; 
	int price; 
	int piece;
	String from;

	

	public FruitDTO(String name, int price, int piece, String from) {
		super();
		this.name = name;
		this.price = price;
		this.piece = piece;
		this.from = from;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPiece() {
		return piece;
	}

	public void setPiece(int piece) {
		this.piece = piece;
	}
	
	
}
