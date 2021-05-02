package lesson3_hw2;

public class UserManager {
	
	public void list(User[] users)
	{
		for(User user : users)
		{
			System.out.println(user.get_name());
		}
	}
}
