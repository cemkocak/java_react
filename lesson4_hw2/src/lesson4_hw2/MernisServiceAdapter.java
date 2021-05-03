package lesson4_hw2;

import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements ICustomernCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		// TODO Auto-generated method stub
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
										customer.getFirstName().toUpperCase(), 
										customer.getLastName().toUpperCase(), 
										customer.getDateOfBirth().getYear());
		
	}

}
