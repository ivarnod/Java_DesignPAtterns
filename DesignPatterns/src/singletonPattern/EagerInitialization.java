package singletonPattern;


//In eager initialization, the instance of Singleton Class is created at the time of class loading. 
//This is the easiest method to create a Singleton class, but it has the drawback of the instance being created even though client application might not be using it.
public class EagerInitialization {
	
	@SuppressWarnings("unused")
	private static final EagerInitialization instance = new EagerInitialization();
	
	private EagerInitialization(){}
	
	public static EagerInitialization getInstance(){
		return instance;
	}
	
}
