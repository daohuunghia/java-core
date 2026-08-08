package java_core.chapter7.video84;

public class Manager extends Person implements Trainable {

	private int teamSize;

	public Manager(String name, int age, int teamSize) {
		super(name, age);
		this.teamSize = teamSize;
	}

	@Override
	public void work() {
		System.out.printf("Manager %s is managing a team of %d people%n", super.getName(), this.teamSize);
	}

	@Override
	public void attendTraining(String topic) {
		System.out.println("Manager " + super.getName() + " is attending management training on " + topic);
	}

}
