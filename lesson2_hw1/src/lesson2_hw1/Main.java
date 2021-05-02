package lesson2_hw1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShortCut shortCut1 = new ShortCut();
		shortCut1.id = 1;
		shortCut1.name = "Preparation to Camp"; 
		shortCut1.link = "kodlama.io/p/kampa-hazirlik";
				
		ShortCut shortCut2 = new ShortCut(2, "Frequently Asked Questions","kodlama.io/p/sorular");
		ShortCut shortCut3 = new ShortCut(3, "Login","kodlama.io/login");
		ShortCut shortCut4 = new ShortCut(4, "Sign Up","kodlama.io/signup");
		
		ShortCut[] shortCuts = 
		{
			shortCut1,
			shortCut2,
			shortCut3,
			shortCut4
		};
		
		Course course1 = new Course(285, "Java", "Engin Demiroð");
		Course course2 = new Course(285, "C#", "Engin Demiroð");
		Course course3 = new Course(285, "C++", "Engin Demiroð");
		
		Course[] courses = 
			{
				course1,
				course2,
				course3
			};
		
		SiteManager siteManager = new SiteManager();
		
		
		siteManager.listShortCut(shortCuts);
		System.out.println();
		siteManager.listCourses(courses);
		
	}

}
