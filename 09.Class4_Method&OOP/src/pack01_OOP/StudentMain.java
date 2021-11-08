package pack01_OOP;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "학생1";
		s1.kor = 10;
		s1.eng = 20;
		s1.mat = 30;
		s1.setSum();
		s1.setAvg();
		s1.display();
		
		Student s2 = new Student();
		s2.name = "학생1";
		s2.kor = 40;
		s2.eng = 50;
		s2.mat = 60;
		s2.setSum();
		s2.setAvg();
		s2.display();
		
		Student s3 = new Student();
		s3.name = "학생1";
		s3.kor = 70;
		s3.eng = 80;
		s3.mat = 90;
		s3.setSum();
		s3.setAvg();
		s3.display();
		
	}
}
