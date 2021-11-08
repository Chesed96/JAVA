package pack02_OOP; 

public class PersonDAO {
	// Data Access Object
	// 데이터베이스 접근해서 기능을 수행하는 객체.
	// 데이터베이스에서 데이터를 가져옴.(PersonDTO와 매칭이 되는 데이터)
	// 데이터베이스에 데이터를 보냄.(PersonDTO와 매칭이 되는 데이터)
	// Parametter 이용

	void display(PersonDTO[] persons) {
		System.out.println("이름\t나이\t키\t몸무게\t성별");
		for (int i = 0; i < persons.length; i++) {
			System.out.print(persons[i].name + "\t");
			System.out.print(persons[i].age + "\t");
			System.out.print(persons[i].height + "\t");
			System.out.print(persons[i].weight + "\t");
			System.out.print(persons[i].gender + "\t");
			System.out.println();
		}
	}

	void displayMan(PersonDTO[] persons) {
		System.out.println("남자인 person 조회");
		for (int i = 0; i < persons.length; i++) {
			if (persons[i].gender.equals("남")) {
				System.out.print(persons[i].name + "\t");
				System.out.print(persons[i].age + "\t");
				System.out.print(persons[i].height + "\t");
				System.out.print(persons[i].weight + "\t");
				System.out.print(persons[i].gender + "\t");
				System.out.println();
			}
		}
		System.out.println();
	}

	void displayWoman(PersonDTO[] persons) {
		System.out.println("여자인 person 조회");
		for (int i = 0; i < persons.length; i++) {
			if (persons[i].gender.equals("여")) {
				System.out.print(persons[i].name + "\t");
				System.out.print(persons[i].age + "\t");
				System.out.print(persons[i].height + "\t");
				System.out.print(persons[i].weight + "\t");
				System.out.print(persons[i].gender + "\t");
				System.out.println();
			}
		}
		System.out.println();
	}

	void displayKeyword(PersonDTO[] persons, String name) {
		System.out.println("사용자가 입력한 이름의 회원만 조회");
		for (int i = 0; i < persons.length; i++) {
			if (persons[i].name.equals(name)) {
				System.out.print(persons[i].name + "\t");
				System.out.print(persons[i].age + "\t");
				System.out.print(persons[i].height + "\t");
				System.out.print(persons[i].weight + "\t");
				System.out.print(persons[i].gender + "\t");
				System.out.println();
			}
		}
		System.out.println();
	}

	void displayMaxAge(PersonDTO[] persons) {
		int max = persons[0].age;
		for (int i = 0; i < persons.length; i++) {
			if (max < persons[i].age) {
				max = persons[i].age;
			}
		}
		System.out.println("나이의 최대 값 : " + max);
		System.out.println("이름\t나이\t키\t몸무게\t성별");
		for (int i = 0; i < persons.length; i++) {
			if(persons[i].age == max) {
			System.out.print(persons[i].name + "\t");
			System.out.print(persons[i].age + "\t");
			System.out.print(persons[i].height + "\t");
			System.out.print(persons[i].weight + "\t");
			System.out.print(persons[i].gender + "\t");
			System.out.println();
			}
		}
		System.out.println();
	}

	void displayMinAge(PersonDTO[] persons) {
		int min = persons[0].age;
		for(int i = 0; i<persons.length; i++) {
			if(persons[i].age < min) {
				min = persons[i].age;
			}
		}
		System.out.println("나이의 최소값" + min);
		for (int i = 0; i < persons.length; i++) {
			if(persons[i].age == min) {
			System.out.print(persons[i].name + "\t");
			System.out.print(persons[i].age + "\t");
			System.out.print(persons[i].height + "\t");
			System.out.print(persons[i].weight + "\t");
			System.out.print(persons[i].gender + "\t");
			System.out.println();
			}
		}
		System.out.println();
	}
	
	
	
}
