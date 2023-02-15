package chap07;

public class Bob {
	public int maxRotation;
	public int accumulated;
	public int time;
	public String location;

	public Bob (String location,int maxRotation) {
	this.location = location;
	this.maxRotation = maxRotation;
}
	public boolean roll() {
		++accumulated;
		if(accumulated<maxRotation) {
			System.out.println(location +"누적 시간"+(maxRotation-accumulated));
			return true;
		} else {
			System.out.println("***"+location+"식사 때");
			return false;
		}
	}
	public int time() {
		// TODO Auto-generated method stub
		return 0;
	}	
}
