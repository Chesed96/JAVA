package pack02_VariableType;

public class Ex02_Number {
	public static void main(String[] args) {
		// byte 127 ~ -128

		short s = 10000;// 5자리의 수까지는 표현 가능함.
						// 수의 범위가 현실에서 사용하는 단위보다
						// 적은 수를 나타내기 때문에 사용 빈도가 많이 낮음
		System.out.println("short의 값은 : " + s);

		int i = 1234567890; // 가장 많이 사용되는 정수형 데이터타입
							// 수의 표현 범위도 현실에서 많이 사용되는 단위에 적합
							// 사용빈도가 많이 높음
							// 가장 중요!!!!!★
		System.out.println("int의 값은 : " + i);

		long l = 123456789000L; // 큰 단위에 정수 데이터를 저장할 때
								// 사용빈도가 높지는 않음
								// 다른 대체 데이터 타입이 더 많이 존재하고
								// 뒤에 L을 붙여야하는 불편함이 있음
		System.out.println("long의 값은 : " + l);

	}
}
