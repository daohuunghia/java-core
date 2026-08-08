package java_core.chapter7.video78;

public class Video78 {
	public static void main(String[] args) {
		Vehicle car = new Car("toyota");
		Vehicle motobike = new Motobike("honda");
		Vehicle bus = new Bus("vin");

//		Vehicle[] data = new Vehicle[3];
//		data[1] = motobike;
//		data[0] = car;
//		data[2] = bus;

		Vehicle[] data = { car, motobike, bus };

		for (Vehicle item : data) {
			item.start();
		}
	}
}
