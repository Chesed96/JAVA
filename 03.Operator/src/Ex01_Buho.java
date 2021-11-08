
public class Ex01_Buho {
	public static void main(String[] args) {
		//부호라는 것은 정수나 숫자형 데이터들 앞에 + 또는 -를 붙여서
		//해당하는 숫자가 양수인지 음수인지 나타낸 것.
		//양수의 경우 +부호를 생략한다.(관례) 
	int x = -100; //x (-100);
	System.out.println("원본 데이터인 x의 값 : " +x);
	int result1 = +x;//-100 → +(-100)
	int result2 = -x;//100 → -(-100)
	System.out.println("result1 1의 값은 : " + result1);
	System.out.println("result1 2의 값은 : " + result2);
	int result3 = x * 1; // +x (-100*1)=-100
	int result4 = x * -1; // -x(-100*-1)=100
	System.out.println("result3 의 값은 : " + result3);
	System.out.println("result4 의 값은 : " + result4);
	}
}
