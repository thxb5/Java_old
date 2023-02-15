package chap10;

public class ExcepEx {

	public static void main(String[] args) {
		try {
			test();
		}catch (CustomException e) {
			System.out.println("커스텀 예외 테스트");
		}
	}
	public static void test()throws CustomException {
		throw new CustomException("예외 테스트입니다");
	}
}
