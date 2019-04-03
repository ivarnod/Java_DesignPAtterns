package observerPattern.observ;

public class ObserverTest {

	public static void main(String[] args) {
		// this will maintain all loans information
		Newspaper printMedia = new Newspaper();

		Loan personalLoan = new Loan(12.5f);
		personalLoan.register(printMedia);
		personalLoan.setInterest(3.5f);
	}

}
