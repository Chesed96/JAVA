package pack03_OOP;


public class StudentMain {
	public static void main(String[] args) {
		//데어터 한 건을 dto에 넣고 테스트.
		String[] subject = {"자바","css","jacaScript"};
		int score[] = {10,20,30};
		StudentDTO[] dto = {
				new StudentDTO("학생1", subject),
				new StudentDTO("학생2", subject),
				new StudentDTO("학생3", subject),
				
		};
		// {  [dto 
		//		{ String name , String[] subjects }
		//] [학생2] [학생3] }
		

		


		StudentDAO dao = new StudentDAO();
		dao.display(dto, score);
		dao.displaySum(dto, score);
		dao.displayAvg(dto, score);
		dao.setGrade(dto);
		
		dto = dao.addStudent(dto);
		dao.display(dto, score);
		dao.displaySum(dto, score);
		dao.displayAvg(dto, score);
		
		
		
	}
}
