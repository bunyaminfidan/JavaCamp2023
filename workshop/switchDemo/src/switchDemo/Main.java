package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A': {

			System.out.println("Perfect yo arre success");
			break;
		}
		case 'B': {
			System.out.println("Nice you are success");
			break;
		}
		case 'C':
		case 'D':{

			System.out.println("Good you are success");
		}
			break;
		default:
			System.out.println("Sorry you are Unsuccessful");
		}
	}

}
