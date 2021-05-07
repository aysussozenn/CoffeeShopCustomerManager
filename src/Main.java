


import java.rmi.RemoteException;
import java.util.Date;

import coffeBrandsCustomerManager.business.concretes.BaseCustomerManager;
import coffeBrandsCustomerManager.business.concretes.NeroCustomerManager;
import coffeBrandsCustomerManager.business.concretes.StarbucksCustomerManager;
import coffeBrandsCustomerManager.entities.concretes.Customer;
import core.MernisServiceAdaptor;

public class Main {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws RemoteException, Exception  {
		// TODO Auto-generated method stub
	
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdaptor());
        baseCustomerManager.save(new Customer(1, "Aysu","S�zen",new Date(1998, 2, 9 ) , "12345678910"));
        
    	BaseCustomerManager baseCustomerManager1 = new NeroCustomerManager(new MernisServiceAdaptor());
        baseCustomerManager1.save(new Customer(1, "�i�dem","S�zen",new Date(2004, 2, 9 ) , "12345678911"));
        
	}

}
