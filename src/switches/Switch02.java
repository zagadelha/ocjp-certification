package switches;

public class Switch02 {

	public static void main(String[] args) {

		final int x = 0;
		final int y = 2;

		switch (x + y) {
		case x: {
			System.out.println("A");
		}
		case 1:
			System.out.println("B");
		default:
			System.out.println("default");
			break;
		case y:
			System.out.println("C");
		}

	}

}
