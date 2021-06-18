package exceptions;

/**
 * When exists a finally instruction the Exception is suppressed and delivered
 * to another method with exception treatment
 */
public class ParseIntToString {

	Integer i;

	public static void main(String[] args) {

		String s;
		try {
			s = new ParseIntToString().i.toString();

		} finally {
			try {
				int i = Integer.parseInt(args[0]);

			} catch (NumberFormatException e) {
				System.out.println("NumberFormat ");

			} finally {
				System.out.println("Fin2 ");
			}
			System.out.println("Fin1 ");
		}

	}

}
