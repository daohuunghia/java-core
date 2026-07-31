package java_core.chapter5.video39;

import java.util.Arrays;

public class Video39 {
	public static void main(String[] args) {
		//cach 1
		int[] numbers = new int[5]; // mảng 5 phần tử, mặc định = 0;
		numbers[0] = 10;
		numbers[1] = 20;
		
		//cach 2
		int[] scores = {60, 20, 80,40};
		Arrays.sort(scores);
		
		//cach 3
		String[] names = new String[]{"An", "Nam", "Lan"};
		
		System.out.println(names.length);
		
		for (int i = 0;i< scores.length;i++) {
			System.out.println(scores[i]);
		}
	}
}
