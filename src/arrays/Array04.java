package arrays;

public class Array04 {

	int[] prices;

	public static void main(String[] args) {

		String[][][] arr = new String[2][2][2];
		arr[0][0][0] = "A";
		arr[0][0][1] = "B";
		arr[0][1][1] = "C";
		arr[1][0][0] = "D";
		arr[1][0][1] = "E";
		arr[1][1][1] = "F";

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0][0]);
			System.out.println(arr[i][0][1]);
			System.out.println(arr[i][1][1]);
		}

	}

}
