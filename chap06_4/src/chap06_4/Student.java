package chap06_4;

public class Student {
//ㄴtable 이름:student로 설계할거임
	String name;
	String hakbun;
	String address;
	int kor;
	int math;
	int eng;
//	ㄴ필드
	

	//생성자 만들기(class 블록 안에 존재해야함)
	Student(){}
//	기본생성자 내용없어도 댐
	
	Student(String name,String hakbun,String address){
//	클래스?생성자? 이름과 같고 괄호 있으면 메소드
		this.name=name;
//		this를 쓰는 순간 name과 위의 name색이 같아진다
		this.hakbun=hakbun;
		this.address=address;
		
	}

	Student(String name, String hakbun, String address, int kor, int math, int eng) {
		this.name = name;
		this.hakbun = hakbun;
		this.address = address;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
//	메서드만들기
	int sum() {
		return this.kor+this.math+this.eng;
	}
	double avg() {
		return sum()/3.0;
//		return값이 정수인데 데이터타입을 double로 해놓으면 소수점 자리가 짤림-실수형태의 값이 나오도록 해줘야함-3(x) 3.0(o)
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", hakbun=" + hakbun + ", address=" + address + ", kor=" + kor + ", math="
				+ math + ", eng=" + eng + "]";
	}
}
//~클래스 설계