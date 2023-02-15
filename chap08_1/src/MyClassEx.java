
public class MyClassEx {

	public static void main(String[] args) {
		
//		RemoteControl rc = new Television() ;
		MyClass mc = new MyClass( new Television());
		mc.methodA();
		mc.methodB( new Television());
	}

}
