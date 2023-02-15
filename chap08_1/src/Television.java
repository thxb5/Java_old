

public class Television implements RemoteControl {
	private int voulme;
	
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.voulme=RemoteControl.MAX_VOLUME;
		} else if(volume <RemoteControl.MIN_VOLUME) {
			this.voulme = RemoteControl.MIN_VOLUME;
		}else {
			this.voulme=voulme;
		}
		System.out.println("현재 TV볼륨 :" + this.voulme);
	}

}
