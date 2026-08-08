package java_core.chapter7.video80;

public class Video80 {
	public static void main(String[] args) {
		FullTimeEmployee nv1 = new FullTimeEmployee("Dev", "IT", 8500);
		PartTimeEmployee nv2 = new PartTimeEmployee("Eric", "HR", 7);

		Employee data[] = { nv1, nv2 };

		for (Employee employee : data) {
			employee.printInfo();
			System.out.println("Salary: " + employee.calculateSalary());
		}
	}
}
