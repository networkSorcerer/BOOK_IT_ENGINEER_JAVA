package Test;

public class Test231_16 {
	public static void main(String [] args) {
		int a, b, c, hap;
		a = b = c = 2;
		hap = ++a | b-- & c--;
		System.out.printf("%d %d %d %d", hap, a, b, c);
	}
}
