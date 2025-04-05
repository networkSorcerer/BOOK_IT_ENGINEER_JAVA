package Test;
class Parent64 {
	int x = 1000;
	Parent64(){
		this(3000);
	}
	Parent64(int x) {
		this.x = x;
	}
}

class Child64 extends Parent64 {
	int x = 4000;
	Child64(){
		this(5000);
	}
	Child64(int x){
		this.x =x;
	}
	int getX() {
		return this.x;
	}
}
public class Test64_20 {
	public static void main(String [] args) {
		Child64 c = new Child64();
		System.out.println(c.getX());
	}
}
