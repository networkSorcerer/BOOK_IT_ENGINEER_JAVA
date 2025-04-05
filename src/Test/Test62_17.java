package Test;
abstract class Vehicle123 {
	String name;
	abstract public String getName(String val);
	public String getName() {
		return "Vehicle name : " + name;
	}
}

class Car123 extends Vehicle123 {
	private String name;
	public Car123(String val) {
		name = super.name = val;
	}
	public String getName(String val) {
		return "Car name : " + val;
 	}
	public String getName(byte[] val) {
		return "Car name : " + val;
	}
}
public class Test62_17 {
	public static void main(String [] args) {
		Vehicle123 obj = new Car123("Spark");
		System.out.print(obj.getName());
	}
}
