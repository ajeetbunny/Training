import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Register  {
	Scanner sc=new Scanner(System.in);
	public void Register(){
		System.out.println("userName");
		String reguser=sc.nextLine();
		System.out.println("password");
		String regpass=sc.nextLine();
		Credential reg=new Credential();
		if(reg.checkUsername(reguser)==true)
		{
			System.out.println("username already avaialble");
			System.exit(0);
		}
		else
		reg.addCredential(reguser, regpass);
		System.out.println("Please Select the User Role \n 1. Admin \n 2. Manager \n 3.User");
		switch(sc.nextInt())
		{
		case 1:
			System.out.println(reguser+" Created as Admin");
			break;
		case 2:
			System.out.println(reguser+" Created as Manager");
			break;
		case 3:
			System.out.println(reguser+" Created as User");
			break;
		default:
			System.out.println("Invalid User Type");
		}
		Credential c=new Credential();
		c.addCredential(reguser, regpass);
	}
	
}
