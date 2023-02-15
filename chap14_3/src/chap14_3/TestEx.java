package chap14_3;

public class TestEx {

	public static void main(String[] args) {
		Test t = (x)->{						//()안의 매개변수 재정의
//			System.out.println(x);
			return Integer.parseInt(x);     //return 값 추가
			};// ---> 람다식 . 하나짜리 메소드
			int num = t.m("10"); 
			System.out.println(num);
	}

}
