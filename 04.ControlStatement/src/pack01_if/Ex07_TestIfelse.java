package pack01_if;

public class Ex07_TestIfelse {
	public static void main(String[] args) {
		//int형 데이터를 저장할 수 있는 변수 code라는 변수를 선언하고
		//값을 할당하면서 테스트합니다.
		//if문 사용
		//값이 1이면 콘솔창에 '남자'라고 출력이됨.
		//값이 2이면 콘솔창에 '여자', 3이면 '남자', 4이면 '여자'
		//그 외의 값은 '주민등록번호 오류.'
		
		int code = 5;
		//논리연산자 && AND 논리곱(모든 조건을 만족해야지만 TRUE 반환) 1 * 0 = 0;
			//뒤에 조건을 전부 따짐
		//논리연산자 || OR 논리합 (하나의 조건이라도 만족하면 TRUE 반환) 1 + 0 = 1;
			//하나의 조건을 만족하면 뒤에 조건을 무시.
		//논리연산자를 이용하여 '5' 남자, 6 '여자'.
		//if () {} else if{} else { }
		if(code == 1 || code == 3 || code == 5) {
			System.out.println("남자");
		}else if(code == 2 || code == 4 || code == 6) {
			System.out.println("여자");
		}else {
			System.out.println("주민등록번호 오류.");
		}
}
}
