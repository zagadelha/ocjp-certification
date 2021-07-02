package arrayLists;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Ana");
		names.add("Barnie");
		names.add("Cris");

		ArrayList<String> states = new ArrayList<>();
		states.add("Florida");
		states.add("Georgia");
		states.add("Texas");

		ArrayList<String> together = new ArrayList<>();
		together.addAll(names);
		together.addAll(states);

		System.out.println(names);
		System.out.println(states);
		System.out.println("---------------");
		System.out.println(together);

	}

}
