package varargs;

public class Varargs01 {

	void x() {
		System.out.println("Method without arguments");
	}

	void x(String... args) {
		System.out.println("Method with arguments");
	}

	void x(int... args) {
		System.out.println(args[2]);
		System.out.println(args.length);
	}

	public static void main(String[] args) {
		new Varargs01().x();
		new Varargs01().x();
		new Varargs01().x(10,54,99);
	}

}
