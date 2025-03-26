package Test;
class Parent1 {
	void show() {System.out.println("parent");}
}
class Child1 extends Parent1 {
	void show() {System.out.println("child");}
}
public class Test197_1 {
	public static void main(String [] args) {
		Parent1 pa = new Child1();
		pa.show();
	}
}
