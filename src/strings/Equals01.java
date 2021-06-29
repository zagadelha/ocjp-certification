package strings;

public class Equals01 {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "Abc";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));

	}

}
