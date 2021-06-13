package varargs;

public class PermitedCalls {

	public static void main(String[] args) {
		myMethod(); // Likely useless, but possible
		myMethod("one", "two", "three");
		myMethod("solo");
		myMethod(new String[] { "a", "b", "c" });
	}

	private static void myMethod(String... varargs) {
		for (String s : varargs) {
			System.out.println(s);
		}
	}

}
