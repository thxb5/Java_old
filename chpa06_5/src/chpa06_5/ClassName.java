package chpa06_5;

public class ClassName {
	int field1;
	void method1() {}
	static int field2;
	static void method2 () {}
	static void method3 ()  {
		ClassName obj = new ClassName();
		obj.field1 = 10;
		obj.method1();
//		field1 = 10;
//		method1();
		field2 = 10;
		ClassName.method2();
	}
	static {
//		field1 = 10;
//		method1();
		field2 = 10;
		method2();
	}
}