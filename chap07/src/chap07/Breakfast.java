package chap07;

public class Breakfast extends Bob{

	public Breakfast(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean roll() {
		++accumulated;
		if(accumulated<maxRotation) {
			System.out.println(location + "Breakfast Mealtime:"+(maxRotation-accumulated));
		 return true;
	} else {
		System.out.println("***"+location+"공복");
		return false;
	}
	}
}
