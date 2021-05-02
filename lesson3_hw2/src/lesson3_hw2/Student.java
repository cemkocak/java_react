package lesson3_hw2;

public class Student extends User{
	
	public Student(int id, String name,String address, String phone, int level) 
	{
		
		set_id(id);
		set_name(name);
		set_address(address);
		set_phone(phone);
		set_level(level);
		
	}
	
	private int _level;
	
	public int get_level() {
		return _level;
	}

	public void set_level(int level) {
		_level = level;
	}

}
