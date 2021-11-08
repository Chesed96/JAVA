package pack03_Interfaces;

import pack01_Interface.Testinterface;
import pack02_Interface.ReomteController;

//extends (다중 상속을 지원 안함)
//implements (다중 상속을 지원함)
public class Interfaces_Main implements Testinterface, ReomteController{

	@Override
	public void test1() {
		System.out.println("test1입니다.");
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void turnOn() {
		System.out.println("전원을 키는 메소드");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolum(int volume) {
		// TODO Auto-generated method stub
		
	}
	int volume;
	public static void main(String[] args) {
		//turnOn , test1 
		Interfaces_Main im = new Interfaces_Main();
		im.test1();
		im.turnOn();
		
	}
	
		
	
}
