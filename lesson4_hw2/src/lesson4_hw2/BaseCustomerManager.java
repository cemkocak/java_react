package lesson4_hw2;

import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements ICustomerService{
	
	
	public void saveDatabase(Customer customer) throws RemoteException
	{
		System.out.println("Saved to Database: " + customer.getFirstName() + " " + customer.getLastName());;
	}

}
