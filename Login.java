import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login  {
	Scanner sc=new Scanner(System.in);
	Map<String,String>mp=new HashMap<>();
	{
	System.out.println("userName");
	String sample2=sc.nextLine();
	String reguser=sc.nextLine();
	System.out.println("password");
	String regpass=sc.nextLine();
	if(mp.containsKey(reguser))
	{
		if(regpass.equals(mp.get(reguser)))
		{
			System.out.println("User Logged IN \n");
			StoreAjeet app=new StoreAjeet();
			app.Store();
		}
		else
			System.out.println("Invalid Password");
	}
	else
		System.out.println("Invalid Username or Password");
	
}
}
