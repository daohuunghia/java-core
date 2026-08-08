package java_core.chapter7.video80;

public class FullTimeEmployee extends Employee {

	private double monthSalary;

	FullTimeEmployee(String name, String department, double monthSalary) {
		super(name, department);
		this.monthSalary = monthSalary;
	}

	@Override
	public double calculateSalary() {
		return this.monthSalary;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(" | Type: Full-time");
	}
}
