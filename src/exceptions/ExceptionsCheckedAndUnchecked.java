package exceptions;

public class ExceptionsCheckedAndUnchecked {

	public static void main(String[] args) {
		try {
//		testUnchecked();
			testChecked();

		} catch (MyCheckedException e) {
			System.out.println("ERROR: " + e.getMessage());
		}

	}

	private static void testChecked() throws MyCheckedException {
		System.out.println("I am in Checked");
		throw new MyCheckedException("Checked Exception");
	}

	private static void testUnchecked() throws MyUncheckedException {
		System.out.println("I am in Unchecked");
		throw new MyUncheckedException("Unchecked Exception");
	}

}
