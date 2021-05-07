package coffeBrandsCustomerManager.business.concretes;

import java.rmi.RemoteException;

import coffeBrandsCustomerManager.business.abstracts.CustomerService;
import coffeBrandsCustomerManager.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public void save(Customer customer) throws RemoteException, Exception {
		System.out.println("Saved to database: "+customer.getFirstName()+" "+customer.getLastName());
	}
}
