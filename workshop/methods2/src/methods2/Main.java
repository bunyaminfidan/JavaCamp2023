package methods2;

public class Main {

	public static void main(String[] args) {
		
		int numbers[] = {10,25,8,9,6,4,7,8,5,6,3,2};
		System.out.println(numberAddition(numbers));

	}

	public static void add() {

		System.out.println("added");

	}

	public static void update() {
		System.out.println("updated");

	}

	public static void delete() {
		System.out.println("removed");
	}

	
	public static int numberAddition (int numbers[]) {
		int total = 0;
		
		for(int number : numbers) {
			total += number;
			
		}
		return total;
	}
}
