package chap06_2;

public class Car3Ex {

	public static void main(String[] args) {
		
		Car4 myCar=new Car4();
		Car4 myCar4=new Car4();
		
		myCar.setGas(5);
		
		boolean gasState=myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("가스주입ㄴㄴ");
		}else {
			System.out.println("가스주입");
		}
	}

}
