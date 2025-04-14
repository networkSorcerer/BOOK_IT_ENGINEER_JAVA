package Test;

public class Test2021_2_19 {
	public static void main(String []args) {
		Test2021_2_19 a1 = new Test2021_2_19();
		ovr2 a2 = new ovr2();
		System.out.print(a1.sun(3,2) + a2.sun(3,2));
	}
	int sun(int x , int y) {
		return x + y;
	}
}
class ovr2 extends Test2021_2_19 {
	int sun(int x , int y) {
		return x -y + super.sun(x,y);
	}
}
