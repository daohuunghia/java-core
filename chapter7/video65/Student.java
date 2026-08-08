package java_core.chapter7.video65;

public class Student extends Person {

	String school;

	public Student(String school, String name, int age) {
		super(name, age);
		this.school = school;
	}

	@Override
	public void printInfo() {
		System.out.println("Student: " + this.school);
	}

	public void printInfoParent() {
		super.printInfo();
	}
}
