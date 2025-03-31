package Test;

class SuperObject2 {
	public void paint() {
		draw();
	}
	public void draw() {
		draw();
		System.out.println("Super Object");
	}
}

class SubObject2 extends SuperObject2 {
	public void paint() {
		super.draw();
	}
	public void draw() {
		System.out.println("Sub Object");
	}
}
public class Test247_44 {
	public static void main(String []args) {
		SuperObject2 a = new SubObject2();
		a.paint();
	}
}
