package chap06_3;

public class Student {

	String name;
	String hakbun;
	String address;
	int kor;
	int math;
	int eng;
	

	public Student(String name, String hakbun, String address) {
//		메소드이름이 없다-public 과 student사이에 아무것도 없음
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.address = address;
	}
	
	public Student(String name, String hakbun, String address, int kor, int math, int eng) {
		this.name = name;
		this.hakbun = hakbun;
		this.address = address;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
//	double avg() {
//		double result=(this.kor+this.math+this.eng)/3;
//		return result;
////		return 에있는 result의 타입이랑 avg앞의 double이랑 같게 적으면 된다 처음엔 void-뭐가 들어갈지 모르니
//	}//위의 4줄을 줄인것ㄱ
	double avg() {
		return sum()/3.0;
	}
	void printAvg() {
		System.out.println(avg());
	}
	void printSum() {
		System.out.println(sum());
	}
	
	
//	int sum() {
//		int result=this.kor+this.math+this.eng;
//		return result;
//	}=>이걸 한줄로 만들면ㄱ
	int sum() { //총점
		return this.kor+this.math+this.eng;
	}
}

