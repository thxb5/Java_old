package chap06_4;

public class StudentEx {

	public static void main(String[] args) {
//		ㄴ메인메소드 있는 클래스를 하나 더 만듬
		Student stu;
//		Student:클래스가 일종의 데이터 타입이다(그 데이터타입 안에는 메소드라는 기능도 들어있다)
		stu=new Student();
//		설계시 생성자를 하나라도 만들면 컴파일러는 기본 생성자를 지원해주지 않는다.그래서 오류가 나는것(앞Student 클래스파일에 기본생성자 만들면 오류 없어짐)
		
		stu.name="홍";
		stu.hakbun="202201";
		stu.address="서울 마포구";
		Student stu2=new Student("홍","202201","서울 마포구");
//		괄호 안의 순서 중요하다
		
		
		stu2.kor=90;
		stu2.math=89;
		stu2.eng=97;
		
		double dd=stu2.avg();
		System.out.println(dd);
	}

}
//*필드값을 갖고있는 메소드사용하려고 객체지향 언어 사용하는것이다*