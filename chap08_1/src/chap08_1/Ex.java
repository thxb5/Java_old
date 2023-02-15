package chap08_1;

public class Ex {

	public static void main(String[] args) {
		ImplC impl = new ImplC();

		InterfaceA ia = impl;
		ia.methodA();
		InterfaceB ib = impl;
		ib.methodB();
		InterfaceC ic = impl;
		ic.methodC();
		ic.methodB();
		ic.methodC();
	}

}
