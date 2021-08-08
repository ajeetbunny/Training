import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User1 {
	
	static Scanner sc=new Scanner(System.in);
	Map<String,String> mp=new HashMap<>();
	static User1 u=new User1();
	public static void main(String[] args) throws InvalidException 
	{
		System.out.println("Hi \n 1. Login \n 2. Register");
		switch(sc.nextInt())
		{
		case 1:
			
			u.login();
			break;
		case 2:
			u.register();
			break;
		default:
			throw new InvalidException("Invalid value");
		}
	}
	public void register() throws InvalidException{
		System.out.println("userName");
		String sample=sc.nextLine();
		String reguser=sc.nextLine();
		System.out.println("password");
		String regpass=sc.nextLine();
		if(mp.containsKey(reguser)==false)
		{
			mp.put(reguser, regpass);
			System.out.println("Please Select the User Role \n 1. Admin \n 2. Manager \n 3.User");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println(reguser+" Created as Admin");
				ProductServiceClass p1=new ProductServiceClass();
				p1.productService();
				break;
			case 2:
				System.out.println(reguser+" Created as Manager");
				break;
			case 3:
				System.out.println(reguser+" Created as User");
				break;
			default:
				throw new InvalidException("Invalid user type");
				
	
			}
			System.out.println("Hi \n 1. Login \n 2. Register");
			switch(sc.nextInt())
			{
			case 1:
				
				u.login();
				break;
			case 2:
				u.register();
				break;
			default:
				throw new InvalidException("Invalid selection");
			}
		}		
		else
			System.out.println("Username already available");
	}
	public void login() throws InvalidException{
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
				StoreAjeet app=new StoreAjeet(reguser);
				app.Store();
			}
			else
				System.out.println("Invalid Password");
		}
		else
			System.out.println("Invalid Username or Password");
		
	}
}
