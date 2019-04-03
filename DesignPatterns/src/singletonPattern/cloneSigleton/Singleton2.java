package singletonPattern.cloneSigleton;

class Singleton2 extends SingletonSuper {
	// 1. Make all constructors private
	private Singleton2() {
	}

	// 2. Declare a private static variable to hold single instance of class
	private static Singleton2 INSTANCE = new Singleton2();

	public static Singleton2 getInstance() {
		return INSTANCE;
	}
}