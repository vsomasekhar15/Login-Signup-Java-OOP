package login;

public class Signup
{
	public static java.util.Scanner se = new java.util.Scanner(System.in);
	public Userd signup()
	{
		System.out.println("Enter the Details to Register");
		System.out.print("Enter User Name: ");
		String a = se.next();

		System.out.print("Enter Password: ");	
		String b = se.next();

		System.out.print("Enter Mobile Number: +91 ");
		long c = se.nextLong();
		
		System.out.print("Enter Email: ");
		String d = se.next();

		return new Userd(a,b,c,d);
	}
}
