package exceptions;

public class ArrayOutOfBoundException {

	// This exception occurs when try to access a invalid position in an Array
	public static void main(String[] args) {

		int arr[] = new int[10];
		arr[10] = 10; // Exception in this point

	}

}
