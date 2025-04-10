class Secure
{
	private String username; // r/w
	private String password; // r/w


	Secure(String username,String password)
	{
		this.username = username;
		this.password = password;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		if(password.length()>=6)
			this.password = password;
		else 
			System.out.println("Invalid password");
	}


	public void login(String username,String password)
	{
		// String s1 = this.username;
		// String s2 = username;

		// String x1 = this.password;
		// String x2 = password;

		// if(s1.equals(s2)  &&  x1.equals(x2))
		// 	System.out.println("Successfully logged in");
		// else 
		// 	System.out.println("Login failed");


		if(this.username.equals(username) && this.password.equals(password))
			System.out.println("Successfully logged in");
		else 
			System.out.println("Login failed");

	}


}

class SecureDriver
{
	public static void main(String[] args) 
	{
		Secure s1 = new Secure("sheela@123","shee@khatarnak123@#");

		s1.login("sheela@123","shee@khatar123@#");


		
	}
}