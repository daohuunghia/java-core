package java_core.chapter7.video68;

public class Manager extends Employee {

	String department;

	Manager(String department, String name, int id, double salary) {
		super(name, id, salary);
		this.department = department;
	}

	@Override
	double calculateSalary() {
		double newSalary = super.calculateSalary() * 1.1 + super.calculateSalary();
		return newSalary;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Department: " + this.getDepartment());
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
