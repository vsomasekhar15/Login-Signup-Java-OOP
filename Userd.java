package login;
public class Userd
{
	private String user_name;
	private String password;
	private long mobile;
	private String email;
	public Userd()
	{}
	public Userd(String user_name, String password, long mobile, String email)
	{
		this.user_name = user_name;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
	}	
	public void setUsername(String user_name)
	{
		this.user_name=user_name;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public void setMobile(long mobile)
	{
		this.mobile=mobile;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getUsername()
	{
		return user_name;
	}
	public String getPassword()
	{
		return password;
	}
	public long getMobile()
	{
		return mobile;
	}
	public String getEmail()
	{
		return email;
	}
}