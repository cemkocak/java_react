package oopIntro;

public class Product {
	
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;

	
	public Product() {
		super();
	}
	
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return  (this.unitPrice * (100 - this.discount ))/100;
	}

	
	// constructer
	/*public Product() 
	{
		System.out.println("Ben çalýþtým");
	}
	
	public Product(int id, String name, double unitPrice, String detail) 
	{
		this(); // boþ contructer 'ý çalýþtýrýr
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	*/

	
	
	//Methodlar buraya yazýlabilir ama prensip olarak yapmýyoruz.
	//SOLID
	
}
