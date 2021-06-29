package types;

import java.io.IOException;
import java.io.InputStream;

/**
 * Compilation error occurs at line 16, because Inputstream dont read bytes.
 * 
 */
public class Type01 {

	public static void main(String[] args) throws IOException {

		byte[] b = new byte[10];
		InputStream in = System.in;
		int i = in.read(b);

		for (byte c : b) {
			System.out.println((char) c);
		}
		in.close();
	}

}
