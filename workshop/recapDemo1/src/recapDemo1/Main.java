package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 1120;
		int number2 = 1125;
		int number3 = 2222;
		int biggerNumber = number1;
		
		//----------------------Long way
		
		if (number1 > number2) {
			
			if (number1 > number3) {
				System.out.println("Bigger number is number 1: "+ number1);
			}else {
				System.out.println("Bigger number is number 3: "+ number3);
			}
			
		} else if (number2 > number3){
			System.out.println("Bigger number is number 2 : "+ number2);
			
			


		}else {
			System.out.println("Bigger number is number 3: "+ number3);
			
		}
		
		//------------------------------------------ other way
		if (biggerNumber < number2) {
				biggerNumber = number2;
		}
		
		if (biggerNumber < number3) {
			biggerNumber = number3;
		}
		
		
		System.out.println("Bigger number is = " + biggerNumber);
		
		
		

	}

}
