package chap07_1;

public abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("숨쉬다");
	}
	
	public abstract void sound();
}
