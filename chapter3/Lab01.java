package java_core.chapter3;

import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap ten: ");
		String name = sc.nextLine();

		System.out.print("Nhap tuoi: ");
		int age = sc.nextInt();

		System.out.printf("Xin chào %s, ban %d tuổi.%n", name, age);
	}
}
