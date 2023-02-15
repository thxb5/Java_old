package chap06;

public class StudentExample {

	public static void main(String[] args) {
		String name="둘리";
//		ㄴ지역변수- 메인메소드가 실행될때만 실행되고 끝남
//		ㄴname은 String의 타입같은거
		System.out.println(name);
		
		Student s1=new Student();
//		ㄴnew를 사용한 순간 p194의 heap영역이 생기는거
		System.out.println(s1.name);
		
		s1.name="도우너";
		System.out.println(s1.name);
		s1.print();
//		ㄴ앞 클래스파일(student.java)의 s1=>print가 출력됨
//		
		Student s2=new Student();
//		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		System.out.println(s2.name);
//		형태는 같으나 사용할때 다르게 사용하는것=객체지향
//		설계해놓은것을 따로 갖다 쓰는거
		

	}

}
