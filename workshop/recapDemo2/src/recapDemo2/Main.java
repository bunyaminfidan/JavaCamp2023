package recapDemo2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		double[] myList = { 1.2, 112.5, 11.5 };
		double total = 0;
		double biggest = myList[0];

		for (double number : myList) {
			System.out.println(number);
			total = total + number;

			if (biggest < number) {

				biggest = number;
			}

		}

		System.out.println("All number total = " + total);
		System.out.println("Biggest number is = " + biggest);
	}

}
