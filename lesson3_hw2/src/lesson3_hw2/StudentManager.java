package lesson3_hw2;

public class StudentManager extends UserManager{
	
	public void add(Student student)
	{
		System.out.println("Öğrenci eklendi.");
	}
	
	public void remove(Student student)
	{
		System.out.println("Öğrenci silindi.");
	}
	
	public void update(Student student)
	{
		System.out.println("Öğrenci güncellendi.");
	}

}
