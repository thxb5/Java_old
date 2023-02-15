package chap07;

public class Lunch extends Bob {
	
	public Lunch(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulated;
		if(accumulated<maxRotation) {
			System.out.println(location + "Lunch mealTime:"+(maxRotation-accumulated)+"회");
			return true;
	} else {
		System.out.println("***"+location+"공복");
		return false;
	} 
	}
}

