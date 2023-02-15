package chap06_2;

public class Car4 {
	private int gas;

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas없음");
			return false;
		}
		System.out.println("gas있음");
		return true;
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달림(가스잔량:"+gas+")");
				gas-=1;
			}else {
				System.out.println("멈춤(가스잔량:"+gas+")");
				return;
			}
		}
	}
}
