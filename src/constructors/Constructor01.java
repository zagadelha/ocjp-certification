package constructors;

public class Constructor01 {

	int a;

	public Constructor01() {
		System.out.println(a);
		a = 15;
		System.out.println(a);
	}

	public static void main(String[] args) {

		new Constructor01(); // default value is 0
	}

}
