package java_core.chapter7.video84;

public class Video84 {

	public static void main(String[] args) {
		Engineer ks = new Engineer("Alice", 25, "AI");
		Manager ql = new Manager("Bob", 40, 10);

		Person[] myPerson = { ks, ql }; // upcasting

		for (Person person : myPerson) {
			person.introduce();
			person.work();

			if (person instanceof Trainable) {
				Trainable trainable = (Trainable) person; // downcasting

				if (person instanceof Engineer) {
					trainable.attendTraining("Cloud Computing");
				} else if (person instanceof Manager) {
					trainable.attendTraining("Leadership");
				}

				trainable.feadback();
			}
			System.out.println();
		}

	}
}
