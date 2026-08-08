package java_core.chapter7.video78;

public class Motobike extends Vehicle {

	Motobike(String brand) {
		super(brand);
	}

	@Override
	public void start() {
		System.out.println("Motobike " + this.getBrand() + " is kick-starting ...");
	}
}
