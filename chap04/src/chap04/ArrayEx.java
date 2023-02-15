package chap04;

public class ArrayEx {

	public static void main(String[] args) {
		String[] aa=new String[] {"1","2","3"};
		aa[0]="0";
		aa[1]="1";
		aa[2]="2";
	
		for(int i=0;i<aa.length;i++) {
			
			System.out.println(aa[i]);
		}

	}

}
