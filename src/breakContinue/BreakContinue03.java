package breakContinue;

public class BreakContinue03 {

	// Using labels to switch de exection path
	public static void main(String[] args) {

		forExterno: for (int i = 0; i <= 10; i++) {

			forInterno: for (int j = 0; j <= 20; j++) {
				System.out.println("I=" + i + " J= " + j);

				if (i == 3 && j == 15) {
					break forInterno;
				}
			}

		}

	}

}
