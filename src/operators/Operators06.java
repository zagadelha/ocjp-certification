package operators;

public class Operators06 {

	public static void main(String[] args) {

		int y = 0;
		for (int x = 0; x < 10; ++x) {
			y = x % 5 + 2;
		}
		System.out.println(y);
	}

}
