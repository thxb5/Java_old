package chap06_3;

public class StudentEx {//메인메소드 만듬-클래스파일 새로열기 //그냥 Student class는 생성자

	public static void main(String[] args) {
		Student st=new Student("홍길동","2020","서울 마포구",80,90,60);
		int result=st.sum();
//		System.out.println(st.sum());ㄱ아래와 같다
		st.printSum();
//		System.out.println(st.avg());ㄱ아래와 같다
		st.printAvg();
	}

}
