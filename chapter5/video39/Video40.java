package java_core.chapter5.video39;

import java.util.Scanner;

public class Video40 {
	public static void main(String[] args) {
		int total = 0;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[5];
		System.out.println("Nhập vào 5 số nguyên:");
		
		int currentNum;
		for(int i = 0;i < numbers.length;i++) {
			System.out.print("So nguyen thu " + (i + 1) + ": ");
			currentNum = sc.nextInt();
			numbers[i] = currentNum;
			total += currentNum;
			if(currentNum > max) {
				max = currentNum;
			}
		}
		sc.close();
		
		//print
		System.out.println("Total: " + total);
		System.out.println("Number max: " + max);
	}

}
