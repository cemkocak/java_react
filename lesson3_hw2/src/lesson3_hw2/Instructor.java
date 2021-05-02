package lesson3_hw2;

public class Instructor extends User{
	
	public Instructor(int id, String name,String address, String phone, int respect) 
	{
		
		set_id(id);
		set_name(name);
		set_address(address);
		set_phone(phone);
		set_respect(respect);
		
	}
	
	private int _respect;

	public int get_respect() {
		return _respect;
	}

	public void set_respect(int respect) {
		_respect = respect;
	}

}
