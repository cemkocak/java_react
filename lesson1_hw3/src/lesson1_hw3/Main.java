package lesson1_hw3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int numberOfClassStudents = 20;
		int numberOfAllStudents = 1000;
		int numberOfTeachers = 600;
		String mesaj1 = "Sýnýf ";
		String mesaj2 = "Okul ";
		String mesaj3 = "Öðretmen ";
		String mesaj4 = "Öðrenci ";
		String mesaj5 = "Sayýsý: ";
		
		boolean bool = true;
		char	karakter = 'A';
		byte	bayt = -127;
		short	kýsa = 32112;
		int		tamSayi = 1231231231;
		long	uzun = 1234567891011111111L;
		float	ondalikliSayi = 45.54f;
		double	dabýl = 12.5;
		
		int num1 = 10;
		int num2 = 110;
		int num3 = 3;
		int top = 0;
		
		char grade = 'A';
		
		int i = 0, j = 0, k = 0;
		
		
		String muh1 = "BARIÞ";
		String muh2 = "CEM";
		String muh3 = "ERCAN";
		String muh4 = "SERHAT";
		String[] muhler = new String[4];
		muhler[0] = "BARIÞ";
		muhler[1] = "CEM";
		muhler[2] = "ERCAN";
		muhler[3] = "SERHAT";
		
		double[] dabilDizisi = {1.0, 1.1, 1.2, 1.3, 1.4};
		
		
		System.out.println("Hello World!");
		
		System.out.println(mesaj2 + mesaj3 + mesaj5 + numberOfTeachers);
		System.out.println(mesaj2 + mesaj4 + mesaj5 + numberOfAllStudents);
		System.out.println(mesaj1 + mesaj4 + mesaj5 + numberOfClassStudents);
		
		tamSayi=20;
		if(tamSayi<20)
			System.out.println("The number is smaller than 20.");
		else if(tamSayi>20)
			System.out.println("The number is bigger than 20.");
		else
			System.out.println("The number is equal to 20.");
		
		top = num1;
		if(top<num2)
			top = num2;
		if(top<num3)
			top = num3;
		System.out.println("BIGGEST NUMBER IS " + top);
		
		grade = 'G';
		switch(grade)
		{
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
				break;
			case 'C':
				System.out.println("C");
				break;
			case 'D':
				System.out.println("D");
				break;
			case 'E':
				System.out.println("E");
				break;
			case 'F':
				System.out.println("F");
				break;
			default:
				System.out.println("NO!");
		}
		
		for(int counter = 1; counter <= 10; counter++)
		{
			System.out.println(counter);
		}
		
		int counter = 1;
		while(counter <= 10)
		{
			System.out.println(counter);
			counter++;
		}
		
		counter = 1;
		do
		{
			System.out.println(counter);
			counter++;
		}
		while(counter <= 10);
		
		for(String name : muhler)
		{
			System.out.println(name);
		}
		
		double total = 0;
		for(double number:dabilDizisi)
			total += number;
		System.out.println(total);
		
		int[][][] seh = new int[2][2][2];
		
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Kocaeli";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakýr";
		sehirler[2][1] = "Þanlýurfa";
		sehirler[2][2] = "Gaziantep";
		
		String message = "Bugün hava çok güzel!";
 		System.out.println("4. karakter: " + message.charAt(3));
 		System.out.println( message.concat(" Di mi?") );
 		System.out.println( message.startsWith("B") );
 		System.out.println( message.endsWith("!") );
		
		char[] karakterler = new char[10];
		message.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(message.indexOf('a'));
		System.out.println(message.lastIndexOf('a'));
		System.out.println(message.replace(' ', '_'));
		System.out.println(message.substring(2, 5));
		
		for (String kelime : message.split(" "))
			System.out.println(kelime); 
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
		*/
		
		int number = 13;
		boolean isPrime = true;
		
		for (int counter = 2; counter < number; counter++)
		{
			if(number%counter == 0)
				isPrime = false;
		}
		
		if(isPrime)
			System.out.println("Sayý asaldýr!");
		else
			System.out.println("Sayý asal deðildir :/");
	}

}
