package chap05_2;

public class ScoresEx {

	public static void main(String[] args) {
		Student stu = new Student ("홍", "01", null);
//		Scores sco = new Scores (89,91,88);
//		stu.scores = sco;
		stu.setScores(new Scores(89,91,88));
		System.out.println(stu);
		stu.scores.printSum();
		
	}

	
	}


