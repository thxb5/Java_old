package chap05_2;

public class ComputerEx {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1:"+restlt1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2:"+restlt2);
		
		int result3 = myCom.sum2(new int[] {1,2,3});
		System.out.println("result3:"+restlt3);
		
		int result4 = myCom.sum2(new int[] {1,2,3,4,5});
		System.out.println("result4:"+restlt4);
	}

}
