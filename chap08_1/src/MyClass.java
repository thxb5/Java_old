
public class MyClass {
	RemoteControl rc;
	
	MyClass(RemoteControl rc){
		this.rc=rc;
	}
	
	void methodA() {
		RemoteControl rc;
	}
	void methodB(Television television) {
		
		rc.turnOn();
	}
}
