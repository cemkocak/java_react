package lesson2_hw1;

public class SiteManager {

	public void listShortCut(ShortCut[] shortCuts)
	{
		for(int i = 0; i < shortCuts.length; i++)
			System.out.print(shortCuts[i].name + "   ");
		System.out.print("\n");
		
	}
	
	public void listCourses(Course[] courses)
	{
		for(int i = 0; i < courses.length; i++)
			System.out.print(i+1 + ": " + courses[i].category + "\t" + courses[i].teacher + "\n");
		System.out.print("\n");
		
	}
	

}
