package singletonPattern;

import java.lang.reflect.Constructor;

public class TestSingleton {

	public static void main(String[] args) {

		EagerInitialization eagerInitializationOne = EagerInitialization.getInstance();
		EagerInitialization eagerInitializationTwo = EagerInitialization.getInstance();

		System.out.println("EagerInitialization : ");
		System.out.println(eagerInitializationOne.hashCode());
		System.out.println(eagerInitializationTwo.hashCode());

		LazyInitializedSingleton lazyInitializedSingletonOne = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton lazyInitializedSingletonTwo = LazyInitializedSingleton.getInstance();

		System.out.println("LazyInitializedSingleton : ");
		System.out.println(lazyInitializedSingletonOne.hashCode());
		System.out.println(lazyInitializedSingletonTwo.hashCode());

		BillPughSingleton billPughSingletonOne = BillPughSingleton.getInstance();
		BillPughSingleton billPughSingletonTwo = null;

		Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();

		for (Constructor constructor : constructors) {

			constructor.setAccessible(true);
			try {
				billPughSingletonTwo = (BillPughSingleton) constructor.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		}

		System.out.println("BillPughSingleton : ");
		System.out.println(billPughSingletonOne.hashCode());
		System.out.println(billPughSingletonTwo.hashCode());
	}
}
