package chap05_2;
class Ddd {
	
}
public class Ccc {
	Ddd a;
	int x;
	String s;
	Ccc(int x, int s){
		this.x = x;
		this.s = s;
		
	}
	
	Ccc(Ddd d){
		a=d;
	}
	
//	void mmm(Ddd d) {
//		a=d;
//	}
	
	public static void main(String[]ar) {
//		Ccc c=new Ccc(d);
		Ccc c = new Ccc(new Ddd());
		c.mmm(new Ddd());
//		c.mmm(d);
//		c.a = d;
				
	}
}
