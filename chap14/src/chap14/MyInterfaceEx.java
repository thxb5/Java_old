package chap14;

public class MyInterfaceEx {

	public static void main(String[] args) {
		MyInterface mi = s-> {
			return(s.equals("OK"))?100:0;
					
//			if(s.equals("OK")) {
//				return 100;
//			} else {
//			return 0;
//			}
	};
		int num = mi.method("OK");
		System.out.println(num);
	}
}
