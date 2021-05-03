package lesson4_hw2;

import java.rmi.RemoteException;

public interface ICustomerService {
	void saveDatabase(Customer customer) throws RemoteException;
}
