package strings;

public class StringBuilder02 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("guilherme");

		System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));
		System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));

	}

}
