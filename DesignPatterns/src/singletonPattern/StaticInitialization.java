package singletonPattern;

public class StaticInitialization {

	private static StaticInitialization instance;

	private StaticInitialization() {
	}

	static {
		try {
			instance = new StaticInitialization();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}

	}
	
	public static StaticInitialization getInstance(){
		return instance;
	}

}
