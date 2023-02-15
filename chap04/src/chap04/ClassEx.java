package chap04;

class Test{
	private int num=10;
//	ㄴprivate->붙이는순간 다른 클래스에서 접근을 못함-자기 내부에서만 쓸수있게 멤버를 숨김-메소드를 이용해서 고쳐야함..
	
	void setNum(int number) {
		if(number>0) {
		num=number;
		}else {
			System.out.println("0보다 큰 수만 가능");
		}
	}
	void printStr() {
		System.out.println(num);
	}
}
public class ClassEx {

	public static void main(String[] args) {
//		new Test().num=20;
//		new Test().num=40;
//		2개가 다른애(Test)다
		
//		Test t1=new Test();
//		t1.num=20;
		
//		Test t1;
//		t1=new Test();
//		t1.num=20;--->위의13,14 2줄이랑 같음
		
		Test t1=null;
		Test t2=new Test();
		t1=new Test();
//		t1.num=20;
//		ㄴ위의것을 이러케 고침->
		t1.setNum(-20);
		t1.printStr();
//		System.out.println(t1.num);
//		t2.num=40;
		t2.setNum(40);
//		System.out.println(t2.num);
		t2.printStr();
//		모양은 같지만 t1,t2는 다른애다
	}

}
