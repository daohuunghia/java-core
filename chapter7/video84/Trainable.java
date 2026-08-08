package java_core.chapter7.video84;

public interface Trainable {

	public void attendTraining(String topic);

	default void feadback() {
		System.out.println("Thanks for the training session");
	}

}
