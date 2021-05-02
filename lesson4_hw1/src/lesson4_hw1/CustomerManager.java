/*package lesson4_hw1;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
		
	public void getCustomer()
	{
		databaseManager.getData();
	} 

}
*/

package lesson4_hw1;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal)
	{
		this.customerDal = customerDal;
	}
	
	public void add()
	{
		customerDal.add();
	} 

}