package observerPattern.Stock;

public interface Observer {
	
	public void update(double ibmPrice, double applePrice, double googlePrice); 

}
