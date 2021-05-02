package lesson2_hw2;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//25
		//findNumber();
		//26
		/*
		String message = "Bugün hava çok güzel.";
		String newMessage = giveACityName();
		System.out.println(newMessage);
		int number = sum(15,7);
		System.out.println(number);
		int number2 = sumMultiple(1,2,3,4,5,6,7);
		System.out.println(number2);
		*/
		
		/*
		//28
		//referance type
		CustomerManager customerManager;
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		//29
		//value
		int num1 = 10;
		int num2 = 20;
		num2 = num1;
		num1 = 30;
		System.out.println(num2);
		
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
		*/
		
		/*
		//30
		FourOperations fourOperations = new FourOperations();
		double result = fourOperations.addition(3,4);
		System.out.println(result);
		*/
		
		/*
		//34
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		Product product2 = new Product(2,"Laptop","HP Laptop", 6000, 5, "Black");
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		//System.out.println(product.name);
		
		System.out.println(product.getKod());
		*/
		
		//35
		FourOperations fourOperation = new FourOperations();
		System.out.println(fourOperation.addition(3, 5));
		System.out.println(fourOperation.addition(3, 5, 7));
	}
	
	//25
	/*public static void findNumber() {
		
		int[] numbers = new int[] {1,2,5,7,9,0};
		int targetNumber = 6;
		boolean isThere = false;
		
		for (int number:numbers)
		{
			if(number == targetNumber)
			{
				isThere = true;
				break;
			}
		}
		
		if (isThere)
			giveMessage("Sayý mevcuttur!");
		else
			giveMessage("Sayý mevcut deðildir!");	
	}
	
	
	public static void giveMessage(String message)
	{
		System.out.println(message);
	}
	*/
	//26
	/*
	public static void add() 
	{
		System.out.println("Eklendi");
	}
	
	public static void delete() 
	{
		System.out.println("Silindi");
	}
	
	public static void update() 
	{
		System.out.println("Güncellendi");
	}
	
	public static int sum(int num1, int num2)
	{
		return num1+num2;
	}
	
	public static int sumMultiple(int... numbers)
	{
		int total = 0;
		for(int num:numbers)
			total += num;
		
		return total;
	}
	
	public static String giveACityName()
	{
		return "Ankara";
	}
	*/
	
}