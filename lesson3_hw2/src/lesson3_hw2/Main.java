package lesson3_hw2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instructor instructor_engin = new Instructor(1, "Engin Demiroð", "Ankara/Türkiye", "+905551231212", 95);
		Instructor instructor_ayse = new Instructor(1, "Ayþe Demir", "Ankara/Türkiye", "+905551231213", 94);
		
		Student instructor_cem = new Student(1, "Cem Koçak", "Ýstanbul/Türkiye", "+905551231210", 90);
		Student instructor_baris = new Student(2, "Barýþ Altunoðlu", "Ýstanbul/Türkiye", "+905551231209", 90);
		Student instructor_ercan = new Student(3, "Ercan Tuncay", "Ýstanbul/Türkiye", "+905551231208", 90);
		Student instructor_serhat = new Student(4, "Serhat Mazlum Çetin", "Ýstanbul/Türkiye", "+905551231207", 90);
		
		Instructor[] teachers = new Instructor[] {instructor_engin,instructor_ayse};
		Student[] students = new Student[] {instructor_cem,instructor_baris,instructor_ercan,instructor_serhat};
		
		UserManager userManager = new UserManager();
		userManager.list(teachers);
		System.out.println("");
		userManager.list(students);
	
		
	}

}
