package java_core.chapter7.video68;

public class Video68 {
	public static void main(String[] args) {
		Manager nv = new Manager("IT", "Dev", 100, 1000);
		nv.showInfo();
		System.out.println("---------");
		System.out.println("New salary: " + nv.calculateSalary());
	}

}
