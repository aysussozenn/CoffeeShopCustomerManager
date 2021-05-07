package coffeBrandsCustomerManager.dataAccess.abstracts;

import java.rmi.RemoteException;

import coffeBrandsCustomerManager.entities.concretes.Customer;

public interface CustomerCheckService {
	
	public boolean CheckIfRealPerson(Customer customer) throws Exception, RemoteException;
	

}
