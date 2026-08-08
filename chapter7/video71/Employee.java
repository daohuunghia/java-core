package java_core.chapter7.video71;

public class Employee extends Person {

	private int employeeId;
	private double salary;

	Employee(int employeeId, double salary, String name, int age) {
		super(name, age);
		this.setEmployeeId(employeeId);
		this.setSalary(salary);
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.printf("Employee ID: %d%nSalary: %.2f%n", this.getEmployeeId(), this.getSalary());

	}

	public double calculateSalary() {
		return this.getSalary();
	}

	public double calculateSalary(double bonus) {
		double newSalary = this.salary + bonus;
		this.setSalary(newSalary);
		return newSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
