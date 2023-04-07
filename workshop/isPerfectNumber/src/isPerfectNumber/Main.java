package isPerfectNumber;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		int number = 60;
		int totalDivisor = 0;
		boolean isPerfectNumber = false;

		if (number < 0) {

			System.out.println("Number must be greater than zero");
			return;
		}
		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				System.out.println(i);
				totalDivisor = totalDivisor + i;
			}

		}
		if (totalDivisor == number) {
			isPerfectNumber = true;
		}

		if (isPerfectNumber) {
			System.out.println("This number is total divisor = " + totalDivisor);
		}

	}

}
