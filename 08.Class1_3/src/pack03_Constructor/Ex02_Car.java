package pack03_Constructor;

public class Ex02_Car {
	String company;
	String model;
	String color;
	int maxspeed;
	int speed;
	
	
	//정의 - 만들어 놓은 부분. 
	public Ex02_Car(String company, String model, String color, int maxspeed, int speed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
		this.speed = speed;
	}

}
