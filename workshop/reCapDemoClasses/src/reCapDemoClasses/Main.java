package reCapDemoClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FourMathemacticTransactions fourMathemacticTransactions = new FourMathemacticTransactions();
		int plus = fourMathemacticTransactions.plus(55, 55);
		fourMathemacticTransactions.minus(22, 88);
		fourMathemacticTransactions.divideBy(40, 10);
		fourMathemacticTransactions.multiply(12, 12);

		
		System.out.println(plus);
	}

}
