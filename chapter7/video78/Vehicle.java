package java_core.chapter7.video78;

public class Vehicle {

	private String brand;

	Vehicle(String brand) {
		this.brand = brand;
	}

	public void start() {
		System.out.println("Vehicle is starting ...");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
