package chap10;

public class TtyEx {

	public static void main(String[] args) {
		try {
		Class.forName("java.lang.String");
		System.out.println("있습니다");
		}catch(ClassNotFoundException e) {
			System.out.println("없습니다");
		}finally {
			System.out.println("항상실행");
		}

	}

}
