package chap05_2;

public class Student {	
	String name;
	String hakbun;
	Scores scores;
	
	
	
	public Scores getScores() {
		return scores;
	}



	public void setScores(Scores scores) {
		this.scores = scores;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", hakbun=" + hakbun + ", scores=" + scores + "]";
	}



	public Student(String name, String hakbun, Scores scores) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.scores = scores;
	}



}


