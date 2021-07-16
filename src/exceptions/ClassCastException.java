package exceptions;

public class ClassCastException {

	// This exception occurs when try to cast incompatible types
	public static void main(String[] args) {

		Object s = "OCJP"; // String
		Integer i = (Integer) s; // ClassCastExeption

	}

}
