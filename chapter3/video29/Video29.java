package java_core.chapter3.video29;

import java.util.Scanner;

public class Video29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap diem: ");
		float score = sc.nextFloat();
		String result;
		if(9.0 <= score && score <= 10.0) {
			result = "Xuat sac";
		} else if(8.0 <= score && score < 9.0) {
			result = "Gioi";
		} else if(6.5 <= score && score < 8.0) {
			result = "Kha";
		} else if(5.0 <= score && score < 6.5) {
			result = "TB";
		} else if(0 <= score && score < 5) {
			result = "Yeu";
		} else {
			result = "Khong hop le";
		}
		
		System.out.print("KQ: " + result);
		sc.close();
	}
}
