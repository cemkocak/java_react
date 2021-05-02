package lesson2_hw1;

public class Course {
	
	public Course()
	{
		;
	}
	
	public Course(int id, String category, String teacher) 
	{
		this.id = id;
		this.category = category;
		this.teacher = teacher;
	}
	
	int id;
	String category;
	String teacher;
	
}