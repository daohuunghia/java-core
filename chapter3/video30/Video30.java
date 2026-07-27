package java_core.chapter3.video30;

public class Video30 {
	public static void main(String[] args) {
//		int day = 1;
//		String result = switch (day) {
//		    case 1 -> "Monday";
//		    case 2 -> "Tuesday";
//		    default -> "Another day";
//		};
//		System.out.println(result);
		
		int diem = 8;
		String xepLoai = switch(diem) {
			case 9, 10 -> "Gioi";
			case 7, 8 -> "Kha";
			default -> "TB";
		};
		System.out.println("KQ: " + xepLoai);
	}
}
