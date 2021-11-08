package pack03_Stack;

import java.util.Stack;

public class StackMain {
	//인스턴스 멤버의 규칙 : 인스턴스화하지 않으면 접근이 불가능.
	//STATIC : 인스턴스화 하지 않아도 접근이 가능
	public static void main(String[] args) {
		//(coin의 값을)받아오고싶음 
		//받아온 다음 syso 바로 출력해보고 싶음.
		//Coin 인스턴스화 해서 객체로 만들어보기
		StackMain s = new StackMain();
		Coin coin1 = s.new Coin(100);
		Coin coin2 = new StackMain().new Coin(100);
		Stack<Coin> coinBoxSt = new Stack<>();
		coinBoxSt.push(s.new Coin(100));
		coinBoxSt.push(s.new Coin(50));
		coinBoxSt.push(s.new Coin(500));
		coinBoxSt.push(s.new Coin(10));
		//LIFO구조 Last In First Out
		//System.out.println(coinBoxSt.pop());
		while(!coinBoxSt.isEmpty()) {
			Coin coin = coinBoxSt.pop();
			System.out.println(coin.value);
		}
	}//main
	
	public class Coin{
	//인스턴스멤버	
		private int value;
		
		public Coin(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
	}
}
