package Test;
class Car127 implements Runnable {
	int a;
	public void run() {
		try {
			while(++a < 100) {
				System.out.println("miles traveled : " + a);
				Thread.sleep(100);
			}
		} catch(Exception E) {}
	}
}
public class Test127_5 {
	public static void main(String [] args) {
		Thread t1 = new Thread(new Car127());
		t1.start();
	}
}
