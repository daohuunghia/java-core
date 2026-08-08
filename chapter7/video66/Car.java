package java_core.chapter7.video66;

public class Car extends Vehicle {

	private String type;

	public Car(String type, String brand, int year) {
		super(brand, year);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Type: " + this.type);
	}
}
