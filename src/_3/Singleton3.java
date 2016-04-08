package _3;

public class Singleton3 {

	private static final Singleton3 INSTANCE;
	
	static {
		try {
			INSTANCE = new Singleton3();
		} finally {
			//
		}
	}
	
	private Singleton3() {}
	
	public static Singleton3 getInstance() {
		return INSTANCE;
	}
}
/*created when the class is loaded*/