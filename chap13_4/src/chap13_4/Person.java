package chap13_4;

public class Person {
	private String str;

	public Person(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return " " + str + " ";
	}
	

}
class Worker extends Person {

	public Worker(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
class Student extends Person {

	public Student(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}}
class HighStudent extends Student {

	public HighStudent(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}}