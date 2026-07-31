package java_core.chapter5.video39;

public class Video43 {
	public static void main(String[] args) {
		double[] scores = {8.5, 7.0, 9.0, 6.5, 8.0};
		double sum = 0;
		for(double value : scores) {
			sum += value;
		}
		
		double dTB = sum / (scores.length);
		
		System.out.println("Total: " + sum);
		System.out.println("DTB: " + dTB);
	}
}
