package java_core.chapter7.video78;

public class Car extends Vehicle {

	Car(String brand) {
		super(brand);
	}

	@Override
	public void start() {
		System.out.println("Car " + this.getBrand() + " is starting with key ...");
	}

}
