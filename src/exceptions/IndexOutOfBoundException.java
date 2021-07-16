package exceptions;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundException {

	// This exception occurs when try to access a invalid position in a List
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.get(2); // Exception in this point

	}

}
