package chap06;

import java.util.Scanner;

class Bank{
	int balance=0;

	public static void main(String[] args) {

		boolean run = true;
		
		Bank bank=new Bank();
		
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
				bank.balance= bank.balance+num;
				break;
			case 2:
				System.out.print("출금액>");
				num = scanner.nextInt();
				bank.balance= bank.balance-num;
				break;
			case 3:
				System.out.println("잔고>"+bank.balance);
				break;
			case 4:
				run=false;
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}
}
