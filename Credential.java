import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Credential
{
	Map<String, String> checkCredential = new HashMap<>();
	
	public void addCredential (String username, String password) {
		checkCredential.put(username, password);
	}
	public boolean checkUsername(String username) {
		return checkCredential.containsKey(username);}		
	
	public void verfiyUser(String username, String password) {
		Credential c=new Credential();
		c.addCredential(username,username);
		if (checkCredential.containsKey(username)) {
			if (password.equals(checkCredential.get(username))) {
				System.out.println("User Logged In \n");	
				StoreAjeet app=new StoreAjeet(username);
				app.Store();
			}	
			else
				System.out.println("Invalid password");
		}else
	System.out.println("Invalid Username or password");
	}
}
