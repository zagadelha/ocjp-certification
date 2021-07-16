package exceptions;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError {

	// This exception occurs when the program uses all available memory
	public static void main(String[] args) {

		List<String> arr = new ArrayList<>();
		String s = "";

		while (true) {
			s += " XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
			arr.add(s);
			System.out.println(arr.size() + " - " + s.length() + " - " + s);
		}

	}

}
