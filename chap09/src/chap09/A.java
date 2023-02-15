package chap09;

public class A {
	A(){
		System.out.println("A 객체생성");
	}
	class B {
		B(){
			System.out.println("B 객체생성");
		}
		int field;
//		static int field2
		void method1() {
//			static void m() {}
		}
	}
		
		static class C {
			C(){System.out.println("C 객체생성");}
			int field1;
			static int field2;
			void method1() {}
			static void method2() {}
		}
		
		void method() {
			class D {
				D(){System.out.println("D 객체생성");}
				int field1;
				void method1() {}
			}
			D d =new D();
			d.field1=3;
			d.method1();
		}
	}


