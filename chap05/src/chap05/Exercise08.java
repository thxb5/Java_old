package chap05;

public class Exercise08 {

	public static void main(String[] args) {
		//index안쓰고 한 방법
		int[][]array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum=0;
		double avg=0.0;
		int cnt=0;
		
		for(int[] arr:array) {
			for(int val:arr) {
				sum+=val;
			}
			cnt+=arr.length;
		}
		System.out.println(sum);
		System.out.println((double)sum/cnt);
	}

}
