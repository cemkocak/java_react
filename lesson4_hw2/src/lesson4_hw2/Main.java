package lesson4_hw2;

import java.rmi.RemoteException;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		
		BaseCustomerManager customerManager1 = new NeroCustomerManager();
		customerManager1.saveDatabase(new Customer(	1,
													"Engin",
													"Demiroğ",
													LocalDate.of(1985, 1, 6),
													"tc kimlik no :)"));
		System.out.println("@Nero\n");
		
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.saveDatabase(new Customer(	2,
													"Engin",
													"Demiroğ",
													LocalDate.of(1985, 1, 6),
													"tc kimlik no :)"));
		System.out.println("@Starbucks\n");
		 

	}

}
