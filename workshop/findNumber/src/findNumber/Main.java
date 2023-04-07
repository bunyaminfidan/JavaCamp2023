package findNumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 52, 9, 6, 3, 4, 7, 2, 6 };
		int number = 52;
		boolean isFound = false;

		for (int i = 0; i < numbers.length; i++) {
			if (number == numbers[i]) {
				isFound = true;
				break;

			}

		}
		if (isFound) {
			System.out.println(" Found number");
			
		}else {
			System.out.println("I dont found number");
		}
		

	}

}
