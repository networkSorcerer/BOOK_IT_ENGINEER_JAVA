package Test;

public class Test172_17 {
	public static void main(String [] args) {
		System.out.print(Test172_17.check(1));
	}
	static String check(int num) {
		return (num >= 0) ? "positive" : "negative";
	}
}
/*
 * 여기서도 객체 없이 check()를 호출하려면,
 * 
 * check()도 static으로 선언되어 있어야 합니다
 */