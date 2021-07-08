package constructors;

public class Constructor02 {

	public Constructor02() {
		new Constructor02();
	}

	public static void main(String[] args) {

		new Constructor02(); // infinite loop > StackOverFlow Exception
	}

}
