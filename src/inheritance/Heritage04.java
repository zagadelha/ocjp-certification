package inheritance;

public class Heritage04 {

	public static void main(String[] args) {

		Vehicle2 v = new Vehicle2();
		Car c = new Car();
//		v.a
	}

}

class Vehicle2 {
	int a = 5;
}

class Car2 extends Vehicle2 {
	int a = 10;
}
