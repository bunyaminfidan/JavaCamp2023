package isPrimeNumber;

public class main {

	public static void main(String[] args) {

		int number = 1;
		int remainder = number % 2;

		// System.out.println(remainder);

		boolean isPrime = true;
		if (number >= 2) {

			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;

				}
			}
			if (isPrime) {
				System.out.println("This number is prime");
			}
		}

		else {
			System.out.println("This number isn't prime");

		}

	}

}
