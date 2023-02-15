package concepEvent;


public class Window5 implements MyListener{
	class MyActionListener implements MyListener{

		@Override
		public void action() {
			// TODO Auto-generated method stub
			
		}
		
	}
	MyButton myButton;
	
	Window5(){
		System.out.println("윈도우 만들다");
		MyButton mb = new MyButton();
		this.add(mb);
		mb.addListener(new MyListener() {

			@Override
			public void action() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	void add(MyButton myButton) {
		this.myButton=myButton;
		System.out.println("버튼 붙였다");
	}

	public static void main(String[] args) {
		new Window5();

	}

	@Override
	public void action() {
				
	}

}
