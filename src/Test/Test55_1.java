package Test;
class Static22 {
	public int a = 20;
	static int b = 0;
}
public class Test55_1 {
	public static void main(String [] args) {
		int a = 10;
		Static22.b = a;
		Static22 st = new Static22();
		System.out.println(Static22.b++);
		System.out.println(st.b);
		System.out.println(a);
		System.out.print(st.a);
	}
}
