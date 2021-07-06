package breakContinue;

public class BreakContinue01 {

	public static void main(String[] args) {

		// Ends totally execution when achieve 50
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = ++sum + i;
			if (sum >= 50) {
				System.out.println("I stop in: " + sum);
				break;
			}
		}

	}

}
