package java_core.chapter5.video56;

public class Product {

	String name;
	double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void display()
	{
		System.out.println(this.getName() + " - " + this.getPrice());
	}
	
}
