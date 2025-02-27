import java.util.Scanner;
import users.UserManager;
public class LoginSystem{

	public static void main(String args[]){
		java.io.Console console=System.console();
		String username1;
		char[] pw;
		String password1;
		Scanner in=new Scanner(System.in);
		System.out.printf("Enter Username:\n");
		username1=in.next();
		pw=console.readPassword("Enter password:");
		password1=String.valueOf(pw);
		boolean isAuthenticated=UserManager.LoginProcessor.authenticate(username1, password1);
		if(isAuthenticated){
			System.out.printf("Access granted!");
		}else{
			System.out.printf("Access denied!");
		}
	}


}