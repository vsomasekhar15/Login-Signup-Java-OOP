package login;
// import signup.*;
import main.Main;

public class Validation
{
	public boolean verifyUser(String name)
	{
		String pattern = "^[A-Za-z][a-z]+$";
		if(name.matches(pattern))
		return true;
		else
		return false;
	}


	public static boolean verifyPass(String password)
	{
		String pattern = "^(?=.*[0-9])(?=.*[@#$%^&+=!])[A-Z][A-Za-z0-9@#$%^&+=!]{7,}$";
		if(password.matches(pattern))
		return true;
		else
		return false;
	}


	public boolean verifyMobile(long number)
	{
		String num = String.valueOf(number);
		String pattern = "^[6-9][0-9]{9}$";
		if(num.matches(pattern))
		return true;
		else
		return false;
	}


	public boolean verifyEmail(String email)
	{
		String pattern = "^[A-Za-z0-9+_.-]+@(gmail\\.com|yahoo\\.com|outlook\\.com)$";
		if(email.matches(pattern))
		return true;
		else
		return false;
	}

	public void allValid(Userd us)
	{
		while(true)
		{
			if((verifyUser(us.getUsername())))
			break;
			else
			{
				System.out.println();
				System.out.println("Invalid Username!");
				System.out.println("	Only Characters are Allowed");
				System.out.print("Please ReEnter: ");
				us.setUsername(Signup.se.next());
				verifyUser(us.getUsername());
			}
		}
		while(true)
		{
			if(verifyPass(us.getPassword()))
			break;
			else
			{
				System.out.println();
				System.out.println("Invalid Password!");
				System.out.println("	Password must Contains");
				System.out.println("	Starting letter Must be Capital");
				System.out.println("	It Must Contain minimum 8 Characters");
				System.out.println("	One Special Character");
				System.out.println("	One Number");
				System.out.print("ReEnter Password: ");
				us.setPassword(Signup.se.next());
				verifyPass(us.getPassword());
			}
		}
		while(true)
		{
			if(verifyMobile(us.getMobile()))
			break;
			else
			{
				System.out.println();
				System.out.println("Invalid Mobile Number!");
				System.out.println("	Number Must Contains 10 Digits");
				System.out.println("	Starting with 6/7/8/9");
				System.out.print("ReEnter Mobile Number: ");
				us.setMobile(Signup.se.nextLong());
				verifyMobile(us.getMobile());
			}
		}
		while(true)
		{
			if(verifyEmail(us.getEmail()))
			break;
			else
			{
				System.out.println();
				System.out.println("Invalid Email!");
				System.out.println("	Email must Contains @gmail.com/@yahoo.com/@outlook.in");
				System.out.print("ReEnter Email: ");
				us.setEmail(Signup.se.next());
				verifyEmail(us.getEmail());
			}
		}
		System.out.println();
		System.out.println("Please Check Your Details");
		System.out.println("User_name: "+us.getUsername());
		System.out.println("Password: "+us.getPassword());
		System.out.println("Mobile No: "+us.getMobile());
		System.out.println("Email: "+us.getEmail());
		System.out.println();
	}

	public void confirm(Userd us)
	{
		char confirm;
		while (true) 
		{
			System.out.print("Please Confirm (Y/N): ");
			confirm = Signup.se.next().charAt(0);

			if (confirm == 'Y' || confirm == 'y') 
			{
				System.out.println("Registration Successful");
				break;
			} else if (confirm == 'N' || confirm == 'n') 
			{
				System.out.println("Please choose the Option to reEnter:");
				System.out.println("    1. User_name");
				System.out.println("    2. Password");
				System.out.println("    3. Mobile Number");
				System.out.println("    4. Email");
				int a = Signup.se.nextInt();

				switch (a) {
					case 1:
						System.out.print("Enter User_name: ");
						String u = Signup.se.next();
						us.setUsername(u);
						allValid(us);
						break;
					case 2:
						System.out.print("Enter Password: ");
						String p = Signup.se.next();
						us.setPassword(p);
						allValid(us);
						break;
					case 3:
						System.out.print("Enter Mobile Number: ");
						long m = Signup.se.nextLong();
						us.setMobile(m);
						allValid(us);
						break;
					case 4:
						System.out.print("Enter Email: ");
						String s = Signup.se.next();
						us.setEmail(s);
						allValid(us);
						break;
					default:
						System.out.println("You have Entered Wrong Option:");
						System.out.print("Saving your Details.....");
				}
			} 
			else 
			{
				System.out.println("Invalid input! Please enter 'Y' or 'N'.");
			}
		}
	}
}