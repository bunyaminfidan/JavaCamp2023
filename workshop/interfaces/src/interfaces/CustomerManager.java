package interfaces;

public class CustomerManager implements ICustomerDal {
	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}

	@Override
	public void add() {
		// business code is here

		customerDal.add();

	}

}
