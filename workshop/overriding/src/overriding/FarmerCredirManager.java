package overriding;

public class FarmerCredirManager extends BaseKrediManager {
	
	@Override
	public double calculate (double amount) {
		return amount *  1.8;
		
	}

}
