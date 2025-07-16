package main;
import login.*;
import java.util.List;
import java.util.ArrayList;
public class Main
{
	public static List<Userd> users = new ArrayList<>();

	public static void air()
	{
		
		System.out.println("Welcome");
		System.out.println("1. Login");
		System.out.println("2. Signup");
		System.out.println("3. Exit"); 
		System.out.print("Please choose your option: ");
		int option = Login.sc.nextInt();
		Validation obj2 = new Validation();
		Signup sig =new Signup();
		Login log = new Login();
		switch(option)
		{
			case 1:
				log.userLogin(sig,obj2,users);
				break;
			case 2:
				Userd newUser = sig.signup();
				obj2.allValid(newUser);
				obj2.confirm(newUser);
				users.add(newUser);
				log.userLogin1(users);
				break;
			case 3:
				System.out.println("Thank you for Visiting");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Option. Please Restart the Application");
		}
	}
	public static void main(String args[])
	{
		users.addAll(Userobj.getDefaultUsers());
		air();
	}
}
