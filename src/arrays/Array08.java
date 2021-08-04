package arrays;

import java.util.Arrays;

public class Array08 {

	// Is not possible use Arrays.sort() with Two Dimentional Arrays
	public static void main(String[] args) {

		String[][] strings = { { "A", "Z" }, { "C", "D", "S" }, { "L" } };
		Arrays.sort(strings);

		for (String[] s1 : strings) {
			for (String s2 : s1) {
				System.out.println(s2);
			}
		}

	}

}
