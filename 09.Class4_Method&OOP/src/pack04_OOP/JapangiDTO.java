package pack04_OOP;

public class JapangiDTO {
	
	private int num;
	private String name;
	private int price;
	private int count;
	
	private String id, pw;
	


	public JapangiDTO(int num, String name, int price, int count) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
		this.count = count;
	}

	

	public JapangiDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	
	
	
	
	
	
}
