package chap06_4;

public class Students {
	Student[] stuArr;
//	ㄴ여기에 멤버를 두고싶다
	
	//메소드3개(static을 다 빼고 복붙)
	
	void init() {
		for(int i=0;i<stuArr.length;i++) {
			insertStudent(i,"홍"+i,"0"+(i+1),"마포구",78+i,67+i,57+i);
		}
	}
	void insertStudent(int i,String name,String hakbun,String address,int kor,int math,int eng) {
		stuArr[i]=new Student(name,hakbun,address,kor,math,eng);
	
	}
	Student searchStudent(String hakbun) {
		for(int i=0;i<stuArr.length;i++) {
			if(stuArr[i].hakbun.equals(hakbun)) {
				return(stuArr[i]);
			}
		}
		return null;
	}
	
	void updateScore(String hakbun,int kor,int math,int eng) {
//		for(int i=0;i<stuArr.length;i++) {
//			if(stuArr[i].hakbun.equals(hakbun)) {
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
	}

				
//				stuArr[i].kor=(kor>=0) ? kor: stuArr[i].kor;
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

