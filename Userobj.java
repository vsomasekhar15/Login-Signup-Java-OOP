package login;
import java.util.ArrayList;
import java.util.List;
import login.Userd;


public class Userobj {
    public static Userd userobj;

    public static List<Userd> getDefaultUsers()
    {
        List<Userd> defaultUsers = new ArrayList<>();

        defaultUsers.add(new Userd("Somasekhar", "Somu@1234", 7670925556l, "Somu@gmail.com"));
        defaultUsers.add(new Userd("Gangadhar", "Ganga@567", 9440564244l, "pgreddy@gmail.com"));
        defaultUsers.add(new Userd("Mani", "ManiMani@1234", 9685123555l, "Mani@yahoo.com"));

        return defaultUsers;
    }
}
