package methods;

public class Main {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 52, 9, 6, 3, 4, 7, 2, 6 };
		int findNumber = 522;

		boolean isNumber = findNumberMethod(numbers, findNumber);

		consoleMessage(isNumber, "Number is found", "Number is not found");
	}

	private static boolean findNumberMethod(int numbers[], int findNumber) {

		boolean isFound = false;

		for (int number : numbers) {

			if (findNumber == number) {
				isFound = true;

			}
		}
		return isFound;
	}

	private static void consoleMessage(boolean isFound, String ifMessage, String elseMessage) {
		if (isFound) {
			System.out.println(ifMessage);

		} else {
			System.out.println(elseMessage);

		}
	}
}
