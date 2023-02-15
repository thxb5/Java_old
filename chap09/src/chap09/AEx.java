package chap09;

public class AEx {

	public static void main(String[] args) {
		A a = new A ();
		A.B b = a.new B();
		b.field = 3;
		b.method1();
		
		A.C c = new A.C();
		c.field1 =3;
		c.method1();
		c.field2 = 3;
		A.C.method2();
		
		
		a.method();
	}

}
