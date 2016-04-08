package _5;

public class Singleton5 {

	private Singleton5() {}
	
	private static Singleton5 INSTANCE;
	
	public synchronized Singleton5 getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Singleton5();
		}
		return INSTANCE;
	}
}
/*every single call will require synchronization - costly*/