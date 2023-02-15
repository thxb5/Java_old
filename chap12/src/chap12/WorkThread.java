package chap12;

public class WorkThread extends Thread {

	@Override
	public void run() {
		for(;;)
		System.out.println("WorkThread2");

	}
}
