package chap08_1;

public interface MyInterface {
	void method1();
	default void method2() {
		System.out.println("method2()");
	};
	}
