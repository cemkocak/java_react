package lesson4_hw2;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customernCheckService;
		
	
	public StarbucksCustomerManager(ICustomerCheckService customernCheckService)
	{
		this.customernCheckService = customernCheckService;
	}
	
	@Override
	public void saveDatabase(Customer customer) throws RemoteException{
		// TODO Auto-generated method stub
		if(customernCheckService.checkIfRealPerson(customer))
			super.saveDatabase(customer);
		else
			System.out.println("Not a valid person: " + customer.getFirstName() + " " + customer.getLastName());
		
	}
	
	
}
