package com.ivar.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

	List<Observer> observers;

	double ibmPrice;
	double applePrice;
	double googlePrice;

	StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {

		int index = observers.indexOf(observer);

		System.out.println("Observer " + (index + 1) + " deleted...");

		observers.remove(index);

	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, applePrice, googlePrice);
		}
	}

	/**
	 * @param ibmPrice
	 *            the ibmPrice to set
	 */
	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	/**
	 * @param applePrice
	 *            the applePrice to set
	 */
	public void setApplePrice(double applePrice) {
		this.applePrice = applePrice;
		notifyObserver();
	}

	/**
	 * @param googlePrice
	 *            the googlePrice to set
	 */
	public void setGooglePrice(double googlePrice) {
		this.googlePrice = googlePrice;
		notifyObserver();
	}

}
