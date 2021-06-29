package strings;

public class String01 {

	public static void main(String[] args) {

		String s1 = new String("bye");
		String s2 = new String("bye");
		System.out.println(s1 == s2); // comparando strings como referencias
		System.out.println(s1.equals(s2)); // comparando conteudo

		String s3 = "bye";
		String s4 = "bye";
		System.out.println(s3 == s4); // comparando conteudo strings pelo pool
		System.out.println(s3.equals(s4)); // comparando pelo conteudo

	}

}
