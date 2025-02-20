import java.util.Scanner;

public class Users{
	static String username="Luqman";
	static String password="123";
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.printf("Enter username\n");
		String username2=sc.nextLine();
		System.out.printf("nter password\n");
		String password2=sc.nextLine();
		if(username.equals(username2))
		{
			System.out.printf("Correct username!\n");
		}else{
			System.out.printf("Inorrect username!\n");
		}
		if(password.equals(password2))
		{
			System.out.printf("Correct password!\n");
		}else{
			System.out.printf("Inorrect passowrd!\n");
		}

	}
}