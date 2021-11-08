
public class Circle {

	double r;
		
	public Circle(double r) {
		super();
		this.r = r;
	}

	static double area (double r) {
		System.out.println("원의 반지름 : " + r);
		System.out.println("원의 넓이 : "+ (r * r * 3.14) );
		return (r * r * 3.14);
	}
	
	
}
