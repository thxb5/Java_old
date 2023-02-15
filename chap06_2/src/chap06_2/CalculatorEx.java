package chap06_2;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator myCalc=new Calculator();
		myCalc.powerOn();
		int result1=myCalc.plus(5, 6);
		System.out.println(result1);
		double result2=myCalc.divide(5, 6);
		System.out.println(result2);
		myCalc.powerOff();

	}

}
