package exceptions;

public class MyUncheckedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MyUncheckedException(String msg) {
		super(msg);
	}

}
