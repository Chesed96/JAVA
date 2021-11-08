
public class Ex07_Bool2 {
	public static void main(String[] args) {
		//비교 == < 
		//(a == b) → Q. a 와 b가 같냐? / A. true : a와 b의 값이 같아요. false : a와b의 값이 달라요
		int a = 10;
		String result = a == 10 ? "맞습니다" : "틀립니다" ; 
		System.out.println(result);
		
		result = a != 10 ? "맞다" : "틀리다";
		System.out.println(result);
		
		boolean boolResult = a ==10; // 비교를 사용하면 그 결과는 항상 true, false
		System.out.println(boolResult);
		// String result = a ==10 같은지를 비교
		// ? true 일 때 반환값 : false 일 때 반환값
		//if문이라는 제어문으로 대체가 되지만 개념은 알아야 한다.
		
	}
}
