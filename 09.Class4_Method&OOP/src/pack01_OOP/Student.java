package pack01_OOP;

public class Student {

		String name;
		int kor, eng, mat, sum ;
		double avg;
		//필드에 바로 접근을 막고(현재 방식)
		//getter&setter메소드를 이용해서
		//필드에 접근하게 만든다(객체의 보안)
		
		//setter 메소드
		void setSum() {
			sum = kor+ eng+ mat;
		}
		
		void setAvg() {
			avg = (double) sum/3;
		}
		
		public void display() {
			System.out.println("학생명 : " + name);
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + mat);
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg );
		}
}
