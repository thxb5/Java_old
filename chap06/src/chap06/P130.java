package chap06;

import java.util.Scanner;

public class P130 {

	public static void main(String[] args) {
//		System.out.println("메세지 입력");
//		System.out.println("종료하려면 q입력");
//		
//		Scanner scanner=new Scanner(System.in);
//		String inputString;
//		
//		do {
//			System.out.print(">");
//			inputString=scanner.nextLine();
//			System.out.println(inputString);
//			
//		} while( ! inputString.equals("q"));
//		
//		System.out.println();
//		System.out.println("프로그램 종료");

		
	//	int i=1;
	//	int sum=0;
	//	do {
	//		sum+=i;
	//		i++;
	//		
	//	}while(i<=10);
	//	System.out.println(sum);
//	
		
//		while(true) {
//			int num=(int)(Math.random()*6)+1;
//			System.out.println(num);
//			if(num==6) {
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
		
		
		for(int i=1;i<=10;i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	
		
		
	}
}
