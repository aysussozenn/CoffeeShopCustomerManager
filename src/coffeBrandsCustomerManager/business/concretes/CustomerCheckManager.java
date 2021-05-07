package coffeBrandsCustomerManager.business.concretes;

import coffeBrandsCustomerManager.business.abstracts.CustomerService;
import coffeBrandsCustomerManager.dataAccess.abstracts.CustomerCheckService;
import coffeBrandsCustomerManager.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class CustomerCheckManager implements CustomerCheckService  {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	
	   return true;
		
	}


	

}
