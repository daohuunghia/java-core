package java_core.chapter7.video76;

public class Video76 {
	public static void main(String[] args) {
		Animal dog = new Dog(); // upcasting
		Dog dog2 = (Dog) dog; // down-casting
		dog.makeSound();
		dog2.wagTail();
	}
}
