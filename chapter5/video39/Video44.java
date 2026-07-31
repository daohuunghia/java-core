package java_core.chapter5.video39;

public class Video44 {
	public static void main(String[] args) {
//		String result = "";
//		for(int i = 0;i <1000000;i++) {
//			result += i;
//		}
//		System.out.println(result);
		StringBuilder sb = new StringBuilder("Number: ");
		
		for (int i = 0;i < 1000000;i++) {
			sb.append(i);
		}
		
		System.out.println(sb.toString());
		
	}
}
