package java_core.chapter7.video84;

public class Engineer extends Person implements Trainable {

	private String specialty;

	public Engineer(String name, int age, String specialty) {
		super(name, age);
		this.specialty = specialty;
	}

	@Override
	public void work() {
		System.out.printf("Engineer %s is working on %s project.%n", super.getName(), this.specialty);
	}

	@Override
	public void attendTraining(String topic) {
		System.out.printf("Engineer %s is attending training on %s%n", super.getName(), topic);
	}

}
