package garbageCollector;

public class GarbageCollector01 {

	int b;

	public static void main(String[] args) {

		GarbageCollector01 b;
		for (int i = 0; i < 10; i++) {
			b = new GarbageCollector01();
			b.b = 10;
			System.out.println(i);
		}
		System.out.println("end");
	}

}
