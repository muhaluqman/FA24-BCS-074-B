public class Ticket{
	private int ticketId;
	private Customer customer;
	private int screenNumber;
	private int seatNumber;
	private String movieTitle;
	private double price;
	Ticket(int ticketId, Customer customer, int screenNumber, String movieTitle, double price){
		this.ticketId=ticketId;
		this.customer=customer;
		this.movieTitle=movieTitle;
		this.price=price;
	}
	public void displayTicket(){
		System.out.println("Ticket ID:"+ticketId);
		System.out.println("Screen Number:"+screenNumber);
		System.out.println("Seat Number:"+seatNumber);
		System.out.println("Movie Title:"+movieTitle);
		System.out.println("Price:"+price);
	}
}