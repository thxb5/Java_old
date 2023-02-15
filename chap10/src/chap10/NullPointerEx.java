package chap10;

public class NullPointerEx {
	public static void main(String[]args) {
		String data = null;
		try {
			System.out.println(data.toString());
		}catch(NullPointerException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
			data = "test";
			System.out.println(data.toString());
		}
	}
}
