package chap01;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("문자열> ");
//		String inputString = scanner.nextLine();
//		System.out.println(inputString);
//		System.out.println();
//		
//		System.out.print("정수> ");
//		int inputInt = scanner.nextInt();
//		System.out.println(inputInt);
//		System.out.println();
//		
//		System.out.print("실수> ");
//		double inputDouble = scanner.nextDouble();
//		System.out.println(inputDouble);
//		

		boolean run = true;
		
		int balance	= 0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("----------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("----------");
			System.out.print("선택> ");
			
			int num=scanner.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("예금액>");
				num = scanner.nextInt();
				balance= balance+num;
				break;
			case 2:
				System.out.print("출금액>");
				num = scanner.nextInt();
				balance= balance-num;
				break;
			case 3:
				System.out.println("잔고>"+balance);
				break;
			case 4:
				run=false;
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}
}
