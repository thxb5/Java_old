package chap06_2;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
//		int[][] scores= {{90,85,100},{78,92,95},{82,79,90}};
//		for(int j=0;j<3.;j++) {
//			for(int i=0;i<scores.length;i++) {
//			
//				System.out.print(scores[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		스캐너-배열선언-과목수,학생수입력받아 생성-행열에넣음-
		Scanner scanner=new Scanner(System.in);
		int scores[][];
		boolean run=true;
		int inputNum;
		int inputNum2;
		while(run) {
			System.out.print("과목수입력>");
			inputNum=scanner.nextInt();
			System.out.print("학생수입력>");
			inputNum2=scanner.nextInt();
			scores=new int[inputNum][inputNum2];
			for(int i=0;i<inputNum;i++) {
				for(int j=0;j<inputNum2;j++) {
					System.out.print(i+"번째과목"+j+"번째점수입력>");
					scores[i][j]=scanner.nextInt();
				}
			}
			
			for(int i=0;i<inputNum2;i++) {
				System.out.println();
				for(int j=0;j<inputNum;j++) {
					System.out.print(scores[j][i]+"\t");
				}
			}
				System.out.println();	
		}
	}
}
