package Test;
class Connection0 {
	private static Connection0 _inst = null;
	private int count = 0;
	public static Connection0 get() {
		if(_inst == null) {
			_inst  =new Connection0();
			return _inst;
		}
		return _inst;
	}
	public void count() {count++;}
	public int getCount() {return count;}
}
public class Test144_1 {
	public static void main(String []args) {
		Connection0 conn1 = Connection0.get();
		conn1.count();
		Connection0 conn2 = Connection0.get();
		conn2.count();
		Connection0 conn3 = Connection0.get();
		conn3.count();
		System.out.print(conn1.getCount());
	}

}
