package arrays;

public class Array03 {

	int[] prices;

	public static void main(String[] args) {

		String[] a = new String[2];
		a[0] = "Java";
		a[1] = "Certification";

		String[] b = a; // cast of complex type arrays
		for (String s : b) {
			System.out.println(s);
		}

	}

}
