package pack02_Interface;

//Interface를 이용해서 개발
public class TvClass implements ReomteController{
	private int volume;	// 외부에서는 바로 필드에 접근 불가능
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
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
		System.out.println("TV 현재 볼륨 : " + this.volume);
		setTest();
	}
	

	public int getVolume() {
		return volume;
	}
	public void setTest() {
		System.out.println("테스트중입니다.");
	}
}
