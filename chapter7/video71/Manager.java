package java_core.chapter7.video71;

public class Manager extends Employee {

	private String department;

	Manager(String department, int employeeId, double salary, String name, int age) {
		super(employeeId, salary, name, age);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println("Department: " + this.getDepartment());
	}

}
