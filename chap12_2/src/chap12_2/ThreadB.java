package chap12_2;

public class ThreadB extends Thread {
	public ThreadB() {
		this.setName("B스레드");
	}
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(this.getName());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
