package java_core.chapter7.video70;

public class Video70 {
	public static void main(String[] args) {
		CustomerPrinter customer = new CustomerPrinter();
		customer.print("Dev");
		customer.print("Dev", 20);
		customer.print("Dev", 20, "HaNoi");
	}

}
