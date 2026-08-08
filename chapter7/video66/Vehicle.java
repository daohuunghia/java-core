package java_core.chapter7.video66;

public class Vehicle {

	private String brand;
	private int year;

	public Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void printInfo() {
		System.out.printf("Vehicle: %s, %d%n", this.getBrand(), this.getYear());
	}

}
