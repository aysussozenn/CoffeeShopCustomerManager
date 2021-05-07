package coffeBrandsCustomerManager.business.abstracts;

import java.rmi.RemoteException;

import coffeBrandsCustomerManager.entities.concretes.Customer;

public interface CustomerService {

	public void save(Customer customer) throws RemoteException, Exception;
}
