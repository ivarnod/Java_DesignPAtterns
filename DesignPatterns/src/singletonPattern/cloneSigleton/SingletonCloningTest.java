package singletonPattern.cloneSigleton;

public class SingletonCloningTest {
	public static void main(String[] args) throws Exception {
		System.out.println("Singleton Test!");
		System.out.println("Singleton Instance:" +Singleton2.getInstance());
		System.out.println("Singleton clone:" + Singleton2.getInstance().clone());
	}
}