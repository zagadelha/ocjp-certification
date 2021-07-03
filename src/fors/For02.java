package fors;

public class For02 {

	public static void main(String[] args) {

		for (int a = 0, b = 1, c = 2; a < 5 | b < 5 | c < 5; a++, b++, c++) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

	}

}
