package streams;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Stream01 {

	public static void main(String[] args) {

		ArrayList<Integer> ints = new ArrayList<Integer>();
		IntStream.rangeClosed(0, 9).forEach(ints::add);
		System.out.println(ints);

	}

}
