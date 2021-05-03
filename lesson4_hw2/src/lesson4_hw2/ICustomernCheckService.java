package lesson4_hw2;

import java.rmi.RemoteException;

public interface ICustomernCheckService {
	
	boolean checkIfRealPerson(Customer customer) throws RemoteException;

}
