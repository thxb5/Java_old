package concepEvent;

public class Window2 implements MyListener{
	MyButton myButton;
	
	Window2(){
		System.out.println("윈도우 만들다");
		MyButton mb = new MyButton();
		this.add(mb);
		mb.addListener(this);
	}
	
	void add(MyButton myButton) {
		this.myButton=myButton;
		System.out.println("버튼 붙였다");
	}

	public static void main(String[] args) {
		new Window2();

	}

	@Override
	public void action() {
				
	}

}
