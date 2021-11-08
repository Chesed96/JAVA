package pack02_Interface;

//Audio의 리모컨을 개발한다.(설계도를 이용해서)
public class Audio implements ReomteController{
	private int volume;	// 외부에서는 바로 필드에 접근 불가능
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
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
		System.out.println("현재 볼륨 : " + this.volume);
	}
	

	public int getVolume() {
		return volume;
	}
}
