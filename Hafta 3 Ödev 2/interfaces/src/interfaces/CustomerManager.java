package interfaces;

public class CustomerManager {
	ICustomerDal customer;
	public CustomerManager(ICustomerDal customer) {
		this.customer = customer;
	}
	public void add() {
		customer.add();
	}
}