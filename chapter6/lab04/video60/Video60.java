package java_core.chapter6.lab04.video60;

import java_core.chapter6.lab04.model.Employee;

public class Video60 {
	public static void main(String[] args) {
		Employee nv = new Employee("Dev", 20, "IT", 1000, "IT Global");
		nv.showInfo();
		nv.raiseSalary(150);
		
		System.out.println("-------------");
		System.out.println("New salary: " + nv.getSalary());
	}
}
