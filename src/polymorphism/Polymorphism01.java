package polymorphism;

public class Polymorphism01 {

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Car();
		Vehicle v3 = new HybridCar();

		execute(v3);
	}

	private static void execute(Vehicle v) {
		v.run();
	}

}

class Vehicle {
	void run() {
		System.out.println("Vehicle running...");
	}
}

class Car extends Vehicle {
	@Override
	void run() {
		System.out.println("Car running...");
	}
}

class HybridCar extends Car {
	@Override
	void run() {
		System.out.println("Hybrid car running...");
	}
}
