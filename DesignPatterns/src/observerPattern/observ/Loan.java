package observerPattern.observ;

import java.util.ArrayList;
import java.util.List;

public class Loan implements Subject {

	List<Observer> observers = new ArrayList<Observer>();

	float interest;

	Loan(float interest) {
		this.interest = interest;
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(this.interest);
		}

	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
		notifyObserver();
	}

}
