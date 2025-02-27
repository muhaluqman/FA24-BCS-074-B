package users;
import passwordvalidator.PasswordValidator;
public class UserManager{

	static final String storedUsername="Luqman";
	static final String storedPassword="123";
	public static class LoginProcessor{
		public static boolean authenticate(String username, String password){
			PasswordValidator oc=new PasswordValidator();
			PasswordValidator.Rules ic=oc.new Rules();
			if(storedUsername.equals(username)&&storedPassword.equals(password)&&ic.isValid(password)){
				return true;
			}else{
				return false;
			}
				
		}
	}

}