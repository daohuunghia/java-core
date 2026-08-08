package java_core.chapter7.video71;

public class Video71 {
	public static void main(String[] args) {
		Manager nv = new Manager("IT", 123, 1000, "Dev", 30);
		nv.introduce();
		System.out.println("---------");
		System.out.println("Luong co ban: " + nv.calculateSalary());
		System.out.println("Luong sau thuong: " + nv.calculateSalary(500));
	}

}
