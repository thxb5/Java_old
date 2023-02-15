package chap01;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		boolean ruun = true;
		
		Scanner scanner = new Scanner(System.in);
			System.out.println("1.500원|2.100원|3.50원|4.10원|5.종료");
			System.out.print("선택> ");

			int numb=scanner.nextInt();
			
			switch(numb) {
			case 1:
				System.out.print("500원, 금액>");
				numb = scanner.nextInt();
				int coin500 = numb / 500;
				System.out.println("500원= " + coin500 + "개");
				break;
			case 2:
				System.out.print("100원, 금액>");
				numb = scanner.nextInt();
				int coin100 = numb / 100;
				System.out.println("100원= " + coin100 + "개");
				break;
			case 3:
				System.out.println("50원, 금액>");
				numb = scanner.nextInt();
				int coin50 = numb / 50;
				System.out.println("50원= " + coin50 + "개");
				break;
			case 4:
				System.out.println("10원, 금액>");
				numb = scanner.nextInt();
				int coin10 = numb / 10;
				System.out.println("10원= " + coin10 + "개");
				break;
			case 5:
				ruun=false;
				System.out.println("종료");
				break;
		}
	}
}
			
			
			

	
