package findLetters;

public class Main {

	public static void main(String[] args) {

		char letter = 'B';

		switch (letter) {

		case 'B':
		case 'C':
		case 'D':
		case 'G':
		case 'H':
		case 'T':
		case 'Y': {
			System.out.println("This letter is bass lower");
			break;

		}
		case 'E':
		case 'I':
		case 'A': {
			System.out.println("This letter is thin lower");
			break;

		}
		default:
			System.out.println("No records founds");
		}

	}

}
