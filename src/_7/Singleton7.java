package _7;

public class Singleton7 {

	private Singleton7() {}
	
	private static class Holder {
		private static final Singleton7 INSTANCE = new Singleton7();
	}
	
	public static Singleton7 getInstance() {
		/*la classe interne ne sera charg�e en m�moire que lorsque l'on y fera r�f�rence pour la premi�re fois*/
		return Holder.INSTANCE;
	}
}
