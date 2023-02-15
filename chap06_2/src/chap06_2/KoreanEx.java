package chap06_2;

public class KoreanEx {

	public static void main(String[] args) {
		Korean k2=new Korean("홍길동","123456-1234567","미국");
		System.out.println(k2.name);
		System.out.println(k2.nation);
		System.out.println(k2.ssn);
	
		Korean k1=new Korean("박자바", "011225-1234567");
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
	

	}

}
