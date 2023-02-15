package chap06_3;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		int scores[][];//2차원배열 만들기
		boolean run=true;//while문을 위함
		Scanner scan=new Scanner(System.in);//ctrl+shift+"o"->import java.util.Scanner;생김
		int num;
		int num2;
		while(run) {
			System.out.println("과목수 입력>");
			num=scan.nextInt();
			System.out.println("학생수 입력>");
			num2=scan.nextInt();
			scores=new int[num][num2];
			for(int i=0;i<num;i++) {
				for(int j=0;j<num2;j++) {
					System.out.print(i+"번째과목"+j+"번째점수입력>");
					scores[i][j]=scan.nextInt();
				}
			}
			for(int i=0;i<num2;i++) {
				for(int j=0;j<num;j++) {
					System.out.print(scores[j][i]+"\t");
				}
				System.out.println();
			}
		}
	}
}
