package concepEvent;


public class Window4 implements MyListener{
	class MyActionListener implements MyListener{

		@Override
		public void action() {
			// TODO Auto-generated method stub
			
		}
		
	}
	MyButton myButton;
	
	Window4(){
		System.out.println("윈도우 만들다");
		MyButton mb = new MyButton();
		this.add(mb);
		mb.addListener(new MyActionListener());
	}
	
	void add(MyButton myButton) {
		this.myButton=myButton;
		System.out.println("버튼 붙였다");
	}

	public static void main(String[] args) {
		new Window4();

	}

	@Override
	public void action() {
				
	}

}
