package chap05;

public class Math99 {

	public static void main(String[] args) {
		int[][] gugu=new int[10][10];//0부터 잡히기때문
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				gugu[i][j]=i*j;
				System.out.print(gugu[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
