package overriding;

public class BaseKrediManager {

	public double calculate(double amount) {
		return amount * 1.18;
	}

	public final double calculate2(double amount) {
		return amount * 2.1;
	}

}
