package overriding;

public class TeacherCreditManager extends BaseKrediManager {

	@Override
	public double calculate(double amount) {
		return amount * 1.3;

	}

	// final method
	/*
	 * @Override public double calculate2 (double amount) { return amount * 1.3;
	 * 
	 * }
	 */

}
