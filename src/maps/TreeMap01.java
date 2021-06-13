package maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap01 {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");

		map.replace(1, "1", null);
		map.replace(3, null);
		System.out.println(map.values());
	}

}
