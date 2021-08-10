package inheritance;

public class Heritage01 {

	public static void main(String[] args) {

		Person p = new Man();
		System.out.println(p);
	}

}

//If this constructor the heritage broke, because needs only write a construct to work 
class Person {
//	Person(int a) { 
//	}
}

class Man extends Person {

}
