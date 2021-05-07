package coffeBrandsCustomerManager.business.concretes;

import java.rmi.RemoteException;

import coffeBrandsCustomerManager.business.abstracts.CustomerService;
import coffeBrandsCustomerManager.dataAccess.abstracts.CustomerCheckService;
import coffeBrandsCustomerManager.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {

	private CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) throws RemoteException, Exception {
		
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		
		else {
			
			System.out.println("Not a valid person");
		}
	}
	
	
	
	


}
