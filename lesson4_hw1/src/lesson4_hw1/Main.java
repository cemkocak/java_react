package lesson4_hw1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//40
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.calculate();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator1 = new KidGameCalculator();
		gameCalculator1.calculate();
		gameCalculator1.gameOver();
		
		GameCalculator gameCalculator2 = new OlderGameCalculator();
		gameCalculator2.calculate();
		gameCalculator2.gameOver();
		*/
		
		/*
		//41
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomer();
		*/
		
		/*
		//42-43
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
		*/
		
		
		//44-45
		Product product1 = new Product();
		ProductManager productManager = new ProductManager();
		
		productManager.add(product1);

		product1.id = 1;
		product1.name = "Terazi";
		product1.price = 99.90;
		productManager.add(product1);
		
		DatabaseHelper.Crud.create();
		DatabaseHelper.Connection.disconnect();
		
		
	}
	
}
