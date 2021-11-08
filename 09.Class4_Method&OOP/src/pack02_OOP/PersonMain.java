package pack02_OOP;

import java.util.Arrays;

public class PersonMain {
	public static void main(String[] args) {
		PersonDTO[] persons = new PersonDTO[3];
		//persons라는 *배열 (요소로 PersonDTO를 가지는)을
		//0번부터 배열의 끝 인데스까지 모두 인스턴스화 시키고 값을 출력을 1건만 해보세요.
		System.out.println(Arrays.toString(persons));
		
//		String배열을 예로 들어 ↓
//		String[] arr = new String[3];
//		arr[0] = "1";
//		arr[1] = new String("aa");
//		System.out.println(Arrays.toString(arr));
	
		PersonDTO dto = new PersonDTO("홍길동" , 10, 140, 30, "남");
		persons[0] = dto;	// 방법 1
		persons[1] = new PersonDTO("홍길녀", 20, 160, 50, "여"); // 방법 2
		persons[2] = new PersonDTO("홍길남", 20, 160, 50, "남");
		System.out.println(Arrays.toString(persons));
		
		
		//메소드 호출하기
		//PersonDAO display();
		PersonDAO dao = new PersonDAO(); //dao의 인스턴스화
		dao.display(persons);
		dao.displayMan(persons);
		dao.displayWoman(persons);
		String name = "홍길동";
		dao.displayKeyword(persons, name);
		dao.displayMaxAge(persons);
	}
}