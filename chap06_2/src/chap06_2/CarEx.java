package chap06_2;

public class CarEx {

	public static void main(String[] args) {
//		Car car= new Car(30);
//		숫자,문자,배열 저장 가능..뭐든지 저장 가능한 방
//		car.num=40;
//		car.str="Test";
//		String str=new String("연습");
//		길이는 무한하나 문자열 타입만 가능
//		생성자가 필요하다 클래스이름과 똑같고 괄호 열고닫고가 있으면 생성자다!!
//		int num;
//		바이트수 정해져있음
		
		Car car1=new Car();
		System.out.println("car1.company: "+car1.company);
		System.out.println();
		
		Car car2=new Car("자가용");
		System.out.println("car2.company: "+car2.company);
		System.out.println("car2.model: "+car2.model);
		System.out.println();
		
		Car car3=new Car("자가용","빨강");
		System.out.println("car3.company: "+car3.company);
		System.out.println("car3.model: "+car3.model);
		System.out.println("car3.color: "+car3.color);
		System.out.println();
		
		Car car4=new Car("택시","검정",200);
		System.out.println("car4.company: "+car4.company);
		System.out.println("car4.model: "+car4.model);
		System.out.println("car4.color: "+car4.color);
		System.out.println("car4.maxSpeed: "+car4.maxSpeed);
		System.out.println();
	}

}
