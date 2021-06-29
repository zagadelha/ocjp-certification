package operators;

public class Operators02 {

	public static void main(String[] args) {

		System.out.println(1 == 2 & print("bye"));
		
		System.out.println(1 == 2 && print("bye"));

	}

	private static boolean print(String string) {
		System.out.println(string);
		return false;
	}

}
