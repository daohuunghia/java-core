package java_core.chapter5.video39;

import java.util.Scanner;

public class Lab03 {
	public static void main(String[] args) {
		String[] names = new String[3];
		double[] scores = new double[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i < 3;i++) {
			System.out.println("Nhập tên học sinh " + (i + 1) + ": ");
			names[i] = sc.nextLine();
			
			System.out.println("Nhap diem: ");
			scores[i] = sc.nextDouble();
			
			sc.nextLine();
		}
		
		System.out.println("=======Danh sach hoc sinh========");
		double sum = 0;
		for(int i = 0;i < names.length;i++) {
			System.out.printf("%s - %.2f%n", names[i], scores[i]);
			sum += scores[i];
		}
		System.out.println("===============");
		double dTB = sum / 3;
		System.out.printf("Điểm trung bình: %.2f%n", dTB);
		
		System.out.println("===============");
		
		for(int i = 0;i < names.length;i++) {
			if(scores[i] >= 8) {
				System.out.printf("%s - %.2f%n", names[i], scores[i]);
			}
		}
		
	}
}
