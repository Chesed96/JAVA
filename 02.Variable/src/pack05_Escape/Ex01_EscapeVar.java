package pack05_Escape;

public class Ex01_EscapeVar {
	public static void main(String[] args) {
		//tab을 하고 싶으면	→  \t명령어  
		System.out.println("번호\t이름\t직업");
		//만약에 \ ← 이스케이프 문자를 출력하고 싶을 때는 이스케이프 문자를 두 번 입력하면
		//하나의 이스케이프 문자라고 인식을 한다.
		System.out.println("\\");
		//print (ln) line new (줄바꿈을 의미한다.) print<줄바꿈이 빠져있기 때문에
		//같은 라인에 계속 출력이 됨.
		System.out.println("a\n");// 줄바꿈
		System.out.println("b");
		System.out.println("a\n");

		// |\_/|
		// |q p| /}
		// ( 0 )"""\
		// |"^"` |
		// ||_/=\\__|

		System.out.println("|\\_/|");
		System.out.println("|q p |\t /}");
		System.out.println("( 0  )\"\"\"\\");
		System.out.println("|\"^\"'\t|");
		System.out.println("||_/=\\\\__|");
		System.out.println("우리는 \"개발자\" 입니다. ");

		//"문자열의시작<  문자열의 끝>" + "문자열의시작" + "문자열의끝"
		
		
		// \ /\
		// ) ( ')
		// ( / )
		// \(__)|

		System.out.println("\\   /\\");
		System.out.println(" ) ( ')");
		System.out.println("( /  )");
		System.out.println("\\(__)｜");
	}
}
