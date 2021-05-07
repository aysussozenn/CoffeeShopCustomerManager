package core;

import java.rmi.RemoteException;
import java.util.Calendar;

import coffeBrandsCustomerManager.dataAccess.abstracts.CustomerCheckService;
import coffeBrandsCustomerManager.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements CustomerCheckService {

	@SuppressWarnings("deprecation")
	@Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception, RemoteException {
		
		KPSPublicSoap clientKpsPublicSoap = new KPSPublicSoapProxy();
		return clientKpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		
	}

}
