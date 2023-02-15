package lby;

public class CallStackTest2 {

	public static void main(String[] args) {
	 System.out.println("main(String[] args)이 시작되었음");
	 firstMethod ();
     System.out.println("ㅇㅇㅇ");
		
	}
	static void firstMethod() {
	
		secondMethod();
	System.out.println("2");
	
	}
	
	static void secondMethod() {
	
		System.out.println("3");
	}
}
