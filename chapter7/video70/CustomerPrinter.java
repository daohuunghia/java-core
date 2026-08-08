package java_core.chapter7.video70;

public class CustomerPrinter {

	public void print(String name) {
		System.out.println("Namme: " + name);
	}

	public void print(String name, int age) {
		System.out.println("Namme: " + name + ", Age: " + age);
	}

	public void print(String name, int age, String city) {
		System.out.println("Namme: " + name + ", Age: " + age + "City: " + city);
	}

}