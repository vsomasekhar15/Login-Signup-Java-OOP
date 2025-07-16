package login;
import java.util.List;
import java.util.Random;

public class Login
{
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public void userLogin(Signup sig, Validation obj2, List<Userd> users)
	{
        System.out.println("Please Login");
        char option;
        while (true) 
        {
            System.out.print("Are you Existing User (Y/N):");
            option = sc.next().charAt(0);

            if (option == 'Y' || option == 'y' || option == 'N' || option == 'n')
                break;
            else
                System.out.println("Invalid input! Please enter 'Y' or 'N'.");
        }

        if (option == 'Y' || option == 'y') 
        {
            handleLogin(users);
        } 
        else 
        {
            System.out.println("Please Register");
            Userobj.userobj = sig.signup();
            obj2 = new Validation();
            obj2.allValid(Userobj.userobj);
            obj2.confirm(Userobj.userobj);
            users.add(Userobj.userobj);
            userLogin1(users);
        }
    }

    public void userLogin1(List<Userd> users)
    {
        System.out.println("Please Login");
		handleLogin(users);
    }

    private void handleLogin(List<Userd> users)
    {
        int attempts =0;
        while(attempts<3)
        {
            System.out.print("Enter User Name: ");
            String inputUser = sc.next();

            System.out.print("Enter Password: ");
            String inputPass = sc.next();

            Userd matchedUser = null;
            for(Userd user : users)
            {
                if(user.getUsername().equals(inputUser))
                {
                    matchedUser = user;
                    break;
                }
            }
            if(matchedUser==null)
            {
                System.out.println("Username not found. Please try Again");
                System.out.println("Attempts left: "+(2-attempts));
                attempts++;
                continue;
            }
            if(matchedUser.getPassword().equals(inputPass))
            {
                System.out.println("Login Successful! Welcome, "+matchedUser.getUsername());
                return;
            }
            else
            {
                System.out.println("Incorrect Password.");
                System.out.print("Forgot Password? (Y/N): ");
                char choice = sc.next().charAt(0);

                if(choice == 'Y' || choice == 'y')
                {
                    boolean resestSuccess = resetPassword(matchedUser);
                    if(resestSuccess)
                    {
                        System.out.println("You can now login with your new password");
                        attempts=0;
                    }
                    else
                    {
                        System.out.println("Password reset failed.");
                        System.out.println("Attempts left: "+(2-attempts));
                        attempts++;
                    }
                }
                else
                {
                    System.out.println("Please try Entering your Credentials again.\n");
                    System.out.println("Attempts left: "+(2-attempts));
                    attempts++;
                }
            }
        }
        System.out.println("Too many failed attempts. Existing login.");
    }

    private int generateOtp()
    {
        Random rand = new Random();
        return 1000 + rand.nextInt(9000);
    }

    private boolean resetPassword(Userd user)
    {
        System.out.print("Enter your Registered email: ");
        String inputEmail = sc.next();

        if(user.getEmail().equals(inputEmail))
        {
            int otp = generateOtp();
            System.out.println("OTP sent to your email: "+otp);

            System.out.print("Enter received OTP: ");
            int enteredOtp = sc.nextInt();

            if(enteredOtp==otp)
            {
                String newPass;
                boolean validPasword = false;
                while(!validPasword)
                {
                    System.out.print("Enter your new password: ");
                    newPass = sc.next();
                    if(Validation.verifyPass(newPass))
                    {
                        user.setPassword(newPass);
                        System.out.println("Password has been updated Successfully.");
                        validPasword =true;
                    }
                    else
                    {
                        System.out.println("Invalid Password!");
                        System.out.println("	Password must Contains");
                        System.out.println("	Starting letter Must be Capital");
                        System.out.println("	It Must Contain minimum 8 Characters");
                        System.out.println("	One Special Character");
                        System.out.println("	One Number");
                        System.out.print("ReEnter Password: ");
                    }
                }
                return true;
            }
            else
            System.out.println("Incorrect OTP.");
        }
        else
        System.out.println("Email doesn't match our records.");
        return false;
    }
}
