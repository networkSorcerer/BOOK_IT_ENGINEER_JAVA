package Test;

public class Test164_10 {
	public static void main(String []args) {
		int j, i;
		for(j = 0, i =0; i <=5; i++) {
			j += i;
			System.out.print(i);
			if(i == 5 ) {
				System.out.print("=");
				System.out.print(j);
			}
			else 
				System.out.print("+");
		}
	}
}
