package interfaces;

interface TestA {
	@Override
	String toString();
}

public class InterfaceInstace {
	public static void main(String[] args) {
		System.out.println(new TestA() {
			@Override
			public String toString() {
				return "teste";
			}
		});
	}
}
