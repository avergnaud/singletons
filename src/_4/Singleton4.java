package _4;

public class Singleton4 {

	/*not final*/
	private static Singleton4 INSTANCE;
	
	private Singleton4() {}
	
	/*not thread-safe*/
	public static Singleton4 getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Singleton4();
		}
		return INSTANCE;
	}
}
