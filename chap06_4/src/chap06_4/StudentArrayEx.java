package chap06_4;

public class StudentArrayEx {
	static Student[] stuArr;
//	ㄴstatic붙인이유: 여기있는 stuArr을 아래 메소드에서도 써야되고 하기 때문
	public static void main(String[] args) {
//		배열선언
		stuArr=new Student[10];
//		stuArr[0]=new Student();
//		stuArr[0].name="홍";
//		System.out.println(stuArr[0].name);
//		insertStudent("홍","01","마포구",89,97,67);
//		System.out.println(stuArr[0]);
		for(int i=0;i<stuArr.length;i++) {
			insertStudent(i,"홍"+i,"0"+(i+1),"마포구",78+i,67+i,57+i);
//						지역변수i(와 아래블록의 int i는 서로 다른것임)
		}
//		for(Student stu:stuArr) {
//			System.out.println(stu);
//		}
//		for(int i=0;i<stuArr.length;i++) {
//			if(stuArr[i].hakbun.equals("03")) {
//				System.out.println(stuArr[i]);
//			}
//		}
		System.out.println(searchStudent("03"));
//		searchStudent("03");
//		updateKorScore("03",100);
//		ㄴ03학번을 찾아서 kor점수를 100으로 업데이트
//		searchStudent("03");
		updateScore("03",50,100,90);
		System.out.println(searchStudent("03"));
	}
	static void updateScore(String hakbun,int kor,int math,int eng) {
		
		Student student = searchStudent(hakbun);
		if (kor >= 0) {
			student.kor = kor;
		}
		if (math >= 0) {
			student.math = math;
		}
		if (eng >= 0) {
			student.eng = eng;
		}
//		for(int i=0;i<stuArr.length;i++) {
//			if(stuArr[i].hakbun.equals(hakbun)) {
				
//				stuArr[i].kor=(kor>=0) ? kor: stuArr[i].kor;
////				ㄴp101 삼항연산자
//				if(math>=0) {
//					stuArr[i].math=math;
//				}
//				if(eng>=0) {
//					stuArr[i].eng=eng;
//				}
//				
//				stuArr[i].math=math;
//				stuArr[i].eng=eng;
//				System.out.println(stuArr[i]);
//			}
//		}
	}
	
	static void updateKorScore(String hakbun,int kor) {
		for(int i=0;i<stuArr.length;i++) {
			if(stuArr[i].hakbun.equals(hakbun)) {
				stuArr[i].kor=kor;
				System.out.println(stuArr[i]);
			}
		}
	}
	static Student searchStudent(String hakbun) {
		for(int i=0;i<stuArr.length;i++) {
			if(stuArr[i].hakbun.equals(hakbun)) {
				return(stuArr[i]);
			}
		}
		return null;
	}
	static void insertStudent(int i,String name,String hakbun,String address,int kor,int math,int eng) {
		stuArr[i]=new Student(name,hakbun,address,kor,math,eng);
//		위 블록의 지역변수들과 이 블록의 지역변수들을 이어주려면 static으로 잡아줘야 쓸수있다
		
	}

}
