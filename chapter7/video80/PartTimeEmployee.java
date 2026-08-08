package java_core.chapter7.video80;

public class PartTimeEmployee extends Employee {

	private double hoursWorked;
	private double hoursRate = 500;

	PartTimeEmployee(String name, String department, double hoursWorked) {
		super(name, department);
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculateSalary() {
		return this.hoursWorked * this.hoursRate;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(" | Type: Part-time");
	}

}
