package _1;

public class Singleton1 {

	/*implies the class is final*/
	private Singleton1() {}
	
	/*http://stackoverflow.com/questions/8865086/why-is-this-static-final-variable-in-a-singleton-thread-safe*/
	public static final Singleton1 INSTANCE = new Singleton1();
}
/* there is no getter. So the writer of the singleton cannot update the getter (getInstance) to have more complex rules 
 * without causing the users of the singleton to have to recompile their code*/
