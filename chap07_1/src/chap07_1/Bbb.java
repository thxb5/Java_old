package chap07_1;
class Aaa {
	int x =10;
	Aaa(int x){
		this.x = x;
	}
	final void printX() {
		System.out.println(x);
	}
}

public class Bbb extends Aaa{

	Bbb(int x) {
		super(x);
		printX();
		
	}

	public static void main(String[] args) {
//		Aaa aa =new Aaa();
		Bbb bb = new Bbb(20);

	}

}
