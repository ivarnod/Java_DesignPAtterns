package observerPattern.Stock;

public class StockObserver implements Observer {

	double ibmPrice;
	double applePrice;
	double googlePrice;

	private static int observerIDTracker = 0;

	private int observerID;

	Subject subject;

	StockObserver(Subject subject) {

		this.subject = subject;
		this.observerID = ++observerIDTracker;

		System.out.println("New Observer " + this.observerID);

		subject.register(this);
	}

	@Override
	public void update(double ibmPrice, double applePrice, double googlePrice) {
		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice;
		this.googlePrice = googlePrice;

		printThePrice();
	}

	public void printThePrice() {
		System.out.println(observerID + "\nIBM: " + ibmPrice + "\nApple: "
				+ applePrice + "\nGoogle: " + googlePrice + " \n");
	}

}
