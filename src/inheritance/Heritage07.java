package inheritance;

/*
 * ATENTION: This is a prank, this main program access a static method from a AA class
 */
class Animal {
	void run() {
		System.out.println("Animal runs");
	}

	public void sound() {
		System.out.println("Animal sound");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("Bark");
	}

	@Override
	void run() {
		System.out.println("Dog runs");
	}
}

public class Heritage07 {

	public static void main(String[] args) {

		Animal a = new Dog();
		a.sound();

		Dog d = new Dog();
		d.sound();

	}

}
