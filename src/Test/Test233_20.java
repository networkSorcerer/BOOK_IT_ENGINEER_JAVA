package Test;

public class Test233_20 {
	public static void main(String [] args) {
		int i = 0, hap = 0;
		do {
			++i;
			hap += i;
		} while (i < 5);
		System.out.printf("%d, %d\n",i,hap);
	}
}
