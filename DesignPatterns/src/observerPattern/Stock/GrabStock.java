package observerPattern.Stock;

public class GrabStock {

	public static void main(String[] arr) {

		StockGrabber stockGrabber = new StockGrabber();

		StockObserver observer = new StockObserver(stockGrabber);

		stockGrabber.setIbmPrice(752.36);
		stockGrabber.setApplePrice(456.32);
		stockGrabber.setGooglePrice(562.36);

		StockObserver observer1 = new StockObserver(stockGrabber);
		stockGrabber.setIbmPrice(1752.36);
		stockGrabber.setApplePrice(1456.32);
		stockGrabber.setGooglePrice(1562.36);

		stockGrabber.register(observer);
		stockGrabber.unRegister(observer1);

		// StockObserver observer1 = new StockObserver(stockGrabber);
		// stockGrabber.setIbmPrice(1752.36);
		// stockGrabber.setApplePrice(1456.32);
		// stockGrabber.setGooglePrice(1562.36);

	}

}
