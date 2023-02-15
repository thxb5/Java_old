package chap07;

public class Meal {
	Bob onetime = new Bob ("한끼", 2);
	Bob twotime = new Bob("두끼", 3);
	
	int run() {
		System.out.println("[밥먹자]");
		if(onetime.roll()==false) {stop(); return1;}
		if(twotime.roll()==false) {stop(); return2;}
		
		return 0;
		
	}
}
