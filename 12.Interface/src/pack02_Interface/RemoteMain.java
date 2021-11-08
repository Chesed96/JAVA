package pack02_Interface;

public class RemoteMain {
	public static void main(String[] args) {
		//Audio a = new Audio();
		//a.turnOn();
		//a.turnOff();
		//a.setVolum(100);//개발 에러 0~10 MAX,MIN
		//0~10 사이의 값이 들어오면 값을 세팅한다(설계도를 이용할 것)
		//그 외의 범위값이 들어오면 기존에 있던 값을 그대로 유지한다.
		//System.out.println(a.getVolume());
		
		ReomteController rc;//null
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolum(1);
		
		rc = new TvClass();
		rc.turnOn();
		rc.turnOff();
		rc.setVolum(1);
		//rc.settest();
		
		rc = new Phoneclass();
		rc.turnOn();
		rc.turnOff();
		rc.setVolum(50);
		//rc.qz();
	}
}
