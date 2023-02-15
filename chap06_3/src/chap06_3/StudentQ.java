package chap06_3;

import java.util.Scanner;

public class StudentQ {

	public static void main(String[] args) {
		Student[]stu=new Student[3];

		stu[0]=new Student("홍","123123","서울");
		stu[1]=new Student("길","456456","대구");
		stu[2]=new Student("동","789789","부산");
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<stu.length;i++) {
			System.out.print(stu[i].name+"의 국어점수 입력> ");
			stu[i].kor=scan.nextInt();
			System.out.print(stu[i].name+"의 수학점수 입력> ");
			stu[i].math=scan.nextInt();
			System.out.print(stu[i].name+"의 영어점수 입력> ");
			stu[i].eng=scan.nextInt();
			
		}
		System.out.println("국어\t수학\t영어");
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i].kor+"\t"+stu[i].math+"\t"+stu[i].eng+"\t");
		}
		System.out.println("수정할 학생 학번 입력> ");
		String hakbun=scan.next();
		for(int i=0;i<stu.length;i++) {
			if(hakbun.equals(stu[i].hakbun)) {
				System.out.println("수정할 과목 입력> ");
				String subj=scan.next();
				if(subj.equals("국어")) {
					System.out.println("국어과목점수입력> ");
					int num=scan.nextInt();
					stu[i].kor=num;
					
				}
			}
		}
		System.out.println("국어\t수학\t영어");
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i].kor+"\t"+stu[i].math+"\t"+stu[i].eng+"\t");
		}
	}

}
