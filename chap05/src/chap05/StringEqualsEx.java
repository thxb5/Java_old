package chap05;

public class StringEqualsEx {

	public static void main(String[] args) {
		String strVar1="신";
		String strVar2="신";
		
		if(strVar1 == strVar2){
			System.out.println("strVar1과 strVar2는 참조가 같음");
			
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		String strVar3=new String("신");
		String strVar4=new String("신");
		
		if(strVar3 == strVar4){
			System.out.println("strVar3과 strVar4는 참조가 같음");
			
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
