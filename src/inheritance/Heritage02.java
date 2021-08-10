package inheritance;

public class Heritage02 {

	public static void main(String[] args) {

		// D v1 = new C(); << Compile error because C is not D
		D v2 = new D(); // Works
		C v3 = v2; // Works
		// D v4 = v3; << Compile error, because in runtime not every C is a D
	}

}

interface A {
}

interface B {
}

class C implements A {
}

class D extends C implements B {
}
