package chap07_1;

public class ChildEx {

	public static void main(String[] args) {
		Parent p2 = new Parent();
		boolean result = p2 instanceof Child;
		if(result) {
			Child c2 = (Child)p2;
			System.out.println("성공");
		} else {
			System.out.println("안됩니다");
		}
		Child c2 = (Child) p2;
		
		
		Parent p = new Child();
		p.field1 = "data1";
		p.method1();
		p.method2();
		
		/*
		 
		 */
		Child c = (Child) p;
		c.field2="yyy";
		c.method3();
	}

}
