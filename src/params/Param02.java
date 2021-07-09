package params;

public class Param02 {

	public static void main(String[] args) {

		Person p = new Person();
		p.name = "John";

		test(p);
		System.out.println(p.name);
	}

	// All params of complex types are passing by value reference,
	// Has effect to original variable why is pointing to the same in heap
	static void test(Person p) {
		p.name = "Mary";
	}

}

class Person {
	String name;
}