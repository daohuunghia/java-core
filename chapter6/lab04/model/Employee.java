package java_core.chapter6.lab04.model;

public class Employee {

	private String name;
	private int age;
	private String department;
	private double salary;
	private String company;

	public Employee(String name, int age, String department, double salary, String company) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void showInfo() {
		System.out.printf("Name: %s%nAge: %d%nDepartment: %s%nSalary: %.2f%nCompany: %s%n", this.name, this.age,
				this.department, this.salary, this.company);
	}

	public void raiseSalary(double amount) {
		if (amount > 0) {
			this.salary += this.salary * 0.15;
		}

	}

}
