package chap05;

public class ArrayCreateByValueListEx {

	public static void main(String[] args) {
//		배열 타입으로 선언하고 생성 (배열 경우의 수)
		int[] arr1= {1,2,3,4};
		int arr2[]= {1,2,3,4};
		int[] arr3;
		arr3=new int[] {1,2,3,4};
		int[] arr4=new int[4]; 
		arr4[1]=7; //arr4[1]에만 7을 줌
		for (int i=0;i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		sum(arr3);
}
	
		//배열을 메소드 매게변수를 넘기기 p154
		public static int sum(int arr[]) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		return sum;
		
		

	}

}
