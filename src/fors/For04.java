package fors;

public class For04 {

	static int x = 0;
	static int y = 0;
	static int z = 0;

	public static void main(String[] args) {

		for (x = 30, y = 5, z = 1; x > y; x--, y++, z--) {
			System.out.println("X :" + x + " Y: " + y + " Z: " + z);
		}

	}

}
