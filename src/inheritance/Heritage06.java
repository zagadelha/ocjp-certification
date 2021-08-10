package inheritance;

/*
 * ATENTION: This is a prank, this main program access a static method from a AA class
 */
class AA {
	static void method() {
		System.out.println("AB");
	}
}

class BB extends AA {
	protected static void method() {
		System.out.println("CD");
	}
}

public class Heritage06 {

	public static void main(String[] args) {

		AA a = new BB();
		a.method();

	}

}
