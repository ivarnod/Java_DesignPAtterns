package iterator;

public class TestIterator {

	public static void main(String[] args) {

		NameRepository nameRepository = new NameRepository();

		Iterator itr = nameRepository.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
