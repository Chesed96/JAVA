
public class Ex02_ppmm {
	public static void main(String[] args) {
		// 증감연산자를 사용.
		int x = 1;
		int y = 1;// 변수 x와 y를 각각 1의 값을 주고 초기화
		System.out.println("x++ : " + (x++)); // x의 뒤에 ++증감연산자가 붙음
		System.out.println("++y : " + (++y)); // y의 앞에 ++증감연산자가 붙음
		// ++가 뒤에  붙은 경우에는 출력을 먼저하고 1을 증가시킨다.
		// ++가 앞에 붙은 경우에는 1을 증가 시키고 출력한다.
		x = y++;
		System.out.println("x의 y의 값을 y++시키고 다음 " + x);
		System.out.println("y의 y++ 증감 연산이 된 결과 : " + y);
		// x = ++y ; == x = (y+1)

		// x = y++ ; == x = y;
		// y = y + 1 ;
		
	}
}
