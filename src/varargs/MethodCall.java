package varargs;

public class MethodCall {

	public static void main(String[] args) {
		new MethodCall().go(1, "hi");
		new MethodCall().go(2, "hi", "world");
	}

	private void go(int x, String... y) {
		System.out.println(y[y.length - 1] + " ");
	}

}
