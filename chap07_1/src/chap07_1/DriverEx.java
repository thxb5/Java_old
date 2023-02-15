package chap07_1;

import java.util.Scanner;

public class DriverEx {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Driver driver = new Driver();
		
		Vehicle vehicle;
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
		
		System.out.println("택시와 버스 중 하나를 선택>");
		String inS =  scan.nextLine();
		if(inS.equals("택시")) {
			vehicle =new Taxi();
		} else if(inS.equals("버스")) {
			vehicle = new Bus();
			driver.drive(vehicle);
		}
//		driver.drive(bus);
//		driver.drive(taxi);

	}

}
