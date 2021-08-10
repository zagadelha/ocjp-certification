package inheritance;

public class Heritage03 {

	// All especialized class has a default construtor from superclass that will be
	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		Car c = new Car();
	}

}

class Vehicle {
	Vehicle() {
		System.out.println("Vehicle");
	}
}

class Car extends Vehicle {
	public Car() {
		System.out.println("Car...");
	}
}
