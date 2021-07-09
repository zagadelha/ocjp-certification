package params;

public class Param01 {

	public static void main(String[] args) {

		int i = 5;
		System.out.println(i);
	}

	// All params of primitive types are passing by value copy,
	// Has ho effect to original variable
	static void test(int i) {
		i = 10;
	}

}
