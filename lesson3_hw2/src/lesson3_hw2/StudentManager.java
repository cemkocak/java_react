package lesson3_hw2;

public class StudentManager extends UserManager{
	
	public void add(Student student)
	{
		System.out.println("Öðrenci eklendi.");
	}
	
	public void remove(Student student)
	{
		System.out.println("Öðrenci silindi.");
	}
	
	public void update(Student student)
	{
		System.out.println("Öðrenci güncellendi.");
	}

}
