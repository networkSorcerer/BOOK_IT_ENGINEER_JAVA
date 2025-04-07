package Test;
class Connection123123 {
	private static Connection123123 _inst = null;
	private int count = 0;
	static public Connection123123 get() {
		if(_inst == null) {
			_inst = new Connection123123();
			return _inst;
		}
		return _inst;
	}
	public void count() {
		count++;
	}
	public int getCount() {
		return count;
	}
}
public class Test2024_1 {
	public static void main(String []args) {
		Connection123123 conn1 = Connection123123.get();
		conn1.count();
		Connection123123 conn2 = Connection123123.get();
		conn2.count();
		Connection123123 conn3 = Connection123123.get();
		conn3.count();
		conn1.count();
		System.out.print(conn1.getCount());
	}
}
