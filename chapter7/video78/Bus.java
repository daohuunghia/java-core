package java_core.chapter7.video78;

public class Bus extends Vehicle {

	Bus(String brand) {
		super(brand);
	}

	@Override
	public void start() {
		System.out.println("Bus " + this.getBrand() + " is starting with air brakes ...");
	}
}
