package chap04;

import java.util.Scanner;

public class Math99 {

	public static void main(String[] args) {
//		<구구단>
//		for(int i=2; i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//			System.out.println();
//		}
//
		
//		<구구단-scanner사용>
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("구구단>");
//		int num=scanner.nextInt();
//		for(int i=1;i<=9;i++) {
//			System.out.println(num+"*"+i+"="+(num*i));
//		}
		
		
//		<중첩for문-몇단부터 몇단까지 입력>
		Scanner scanner=new Scanner(System.in);
		System.out.println("구구단 숫자1>");
		int num1=scanner.nextInt();
		System.out.println("구구단 숫자2>");
		int num2=scanner.nextInt();
		for(int j=num1;j<=num2;j++) {
			for(int i=1;i<=9;i++) {
				System.out.println(j+"*"+i+"="+(j*i));
			}
		}
	}
}


