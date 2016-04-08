package _2;

public class Singleton2 {

	/*implies the class is final*/
	private Singleton2() {};
	
	/*created when the class is loaded*/
	private static final Singleton2 INSTANCE = new Singleton2();
	
	public Singleton2 getInstance() {
		return INSTANCE;
	}
}
/*cannot handle cases in which the constructor throws an exception
 * +created when the class is loaded
 */