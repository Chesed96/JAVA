package pack02_Interface;

public class Phoneclass implements ReomteController{

	private int volume;	// 외부에서는 바로 필드에 접근 불가능
	@Override
	public void turnOn() {
		System.out.println("Phone를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Phone를 끕니다.");
		
	}

	@Override
	public void setVolum(int volume) {
		if(volume > MAX_VOL) {
			this.volume = MAX_VOL;	//10
		}else if(volume < MIN_VOL) {
			this.volume = MIN_VOL;	// 0
		}else {
			this.volume =  volume;
		}
		System.out.println("Phone 현재 볼륨 : " + this.volume);
		setTest();
		qz();
	}
	

	public int getVolume() {
		return volume;
	}
	public void setTest() {
		System.out.println("테스트 중입니다.");
	}
	
	private void qz() {
		System.out.println("이걸 하라는 걸까요?");
	}

}
