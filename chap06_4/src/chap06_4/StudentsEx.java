package chap06_4;

public class StudentsEx {

	public static void main(String[] args) {
		Students st=new Students();
//		아까 걔는 생성자가없어서 여기서 생성자 만들어도 됨
		st.stuArr=new Student[10];
		st.init();
		System.out.println(st.searchStudent("03"));
		st.updateScore("03", 100, 100, 100);
		System.out.println(st.searchStudent("03"));
	}

}
