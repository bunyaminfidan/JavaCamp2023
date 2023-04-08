package methodOverloading;

public class Main {

	public static void main(String[] args) {
		FourMathOperations fourMathOperations = new FourMathOperations();

		System.out.println(fourMathOperations.plus(1, 4));
		System.out.println(fourMathOperations.plus(1, 4, 5));
	}

}
