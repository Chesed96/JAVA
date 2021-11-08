package pack02_Interface;

//모든 개발자들이 참조해서 사용할 수 있는 리모컨의 설계도 Interface
public interface ReomteController {
	//상수
	//int VOLUME = 0; ← 설계 에러
	int MAX_VOL = 10;
	int MIN_VOL = 0;	// -를 사용할 수 없게 함.
	//모든 볼륨(RemoteController.i)를 implements 받은 리모컨들은
	//0~10사이의 볼륨만 사용할 것
	
	//추상메소드(메소드의 바디가 없고 이름만 데이터 타입만 정의해놓은 것)
	//abstract
	void turnOn();	//전원 ON기능
	void turnOff();	//전원 OFF
	void setVolum(int volume);//setter를 강제한다.
}
