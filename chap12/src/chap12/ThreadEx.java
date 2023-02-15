package chap12;

public class ThreadEx {

	public static void main(String[] args) {
		Thread th = new WorkThread();
		th.start();
		
		Thread th2 = new Thread(new WorkThread2());
		th.start();
		
		Thread th3 = new Thread() {
			public void run1() {
				
			}
		};
	}	
}
