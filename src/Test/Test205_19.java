package Test;

class Parent205_19 {
	int compute(int num) {
		if(num <=1) return num;
		return compute(num -1) + compute(num -2);
	}
}

class Child205_19 extends Parent205_19 {
	int compute(int num) {
		if(num <=1) return num;
		return compute(num -1) + compute(num -3);
	}
}
public class Test205_19 {
	public static void main(String [] args) {
		Parent205_19 obj = new Child205_19();
		System.out.print(obj.compute(4));
	}

}
