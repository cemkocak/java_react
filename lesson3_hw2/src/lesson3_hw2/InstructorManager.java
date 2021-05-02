package lesson3_hw2;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor)
	{
		System.out.println("Eğitmen eklendi.");
	}
	
	public void remove(Instructor instructor)
	{
		System.out.println("Eğitmen silindi.");
	}
	
	public void update(Instructor instructor)
	{
		System.out.println("Eğitmen güncellendi.");
	}

}
