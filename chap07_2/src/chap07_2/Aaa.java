package chap07_2;
abstract class Bbb{
	abstract void print(); 
}
abstract class Ccc extends Bbb{
	abstract void printC();
}
class Ddd extends Ccc{

	@Override
	void printC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}
	
}
public abstract class Aaa {
	public static void main(String[] args) {
//		Bbb bb = new Bbb();
//		Ccc cc = new Ccc();
	}
}
