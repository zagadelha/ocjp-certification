package breakContinue;

public class BreakContinue02 {

	public static void main(String[] args) {

		// Print just even numbers with continue
		int i = 1;
		while (i < 10) {

			if (i % 2 == 0) {
				System.out.println(i++);
			} else {
				i++;
				continue;
			}
			System.out.println("Passed here");

		}

	}

}
