package chap05;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		private static Account[]accountArray = new Account[100];
		private static Scanner scnner = new Scanner(System.in);
		
		public static void main (String[]args) {
			boolean run = true;
			while(run) {
				System.out.println("--------------------------------------------------");
				System.out.println("1.계좌생성 | 2. 계좌목록 | 3.예금 | 4.출금 | 5.종료");
				System.out.println("--------------------------------------------------");
				System.out.println("선택>");
				
				int selectNo = Scanner.nextInt();
				
				if(selectNo == 1) {
					createAccount();
				}else if (selectNo==2) {
					accountList();
				}else if (selectNo==3) {
					deposit();
				}else if (selectNo==4) {
					withdraw();
				}else if (selectNo==5) {
					run=false;
				}
			}
			System.out.println("프로그램 종료");
		}
		private static void createAccount() {
			System.out.println("----------");
			System.out.println("계좌생성");
			System.out.println("----------");
			
			System.out.println("계좌번호: ");
			string ano = scanner.next()
		}

	}

}
