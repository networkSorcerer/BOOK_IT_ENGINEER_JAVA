package Test;
class Parent3 {
	int compute(int num) {
		if(num <= 1) return num;
		return compute(num -1) + compute(num -2);
	}
}

class Child3 extends Parent3 {
	int compute (int num) {
		if(num <= 1) return num;
		return compute(num -1) + compute(num -3);
	}
}
public class Test193_3 {
	public static void main (String []args) {
		Parent3 obj = new Child3();
		System.out.print(obj.compute(4));
	}
}
