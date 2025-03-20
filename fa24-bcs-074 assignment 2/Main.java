public class Main{
	public static void main(String args[]){
		Cinema c1= new Cinema("Cinema++","Lahore",5);
		Screen s1= new Screen(1,"Barbie",6,7);
		Screen s2= new Screen(2,"Fast and Furious X",8,6);
		c1.addScreen(0,s1);
		c1.addScreen(3,s2);
		c1.displayCinema();
		Customer customer1=new Customer(101,"Ahmad Mohsins","+923214567","ahmad@gmail.com");
		Ticket t1=new Ticket(56,customer1,2,"Barbie",2600);
		t1.displayTicket();
	}
}