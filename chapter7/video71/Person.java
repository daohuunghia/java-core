package java_core.chapter7.video71;

public class Person {

	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void introduce() {
		System.out.printf("Name: %s%nAge: %d%n", this.getName(), this.getAge());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
