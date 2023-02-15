package chap05;

public class Exercise07 {

	public static void main(String[] args) {
		int max=0;
		int[]array= {1,5,3,8,2};
		for(int var : array) {
			if(var>max) {
				max=var;
			}
		}
		System.out.println("max: "+max);
		
	}

}
