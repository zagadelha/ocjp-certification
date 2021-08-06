package fors;

public class For06 {

	static int x = 1;

	public static void main(String[] args) {

		int[] nums = { 0, 1, 2, 3, 4 };

		for (int x : nums) {
			System.out.println(x);
			continue;
//			System.out.println(x + For06.x); => Dont compile to be a unreacheble code
		}

	}

}
