public class Seat{
	private int seatNumber;
	private int rowNumber;
	private SeatType type;
	private double price;
	private boolean isBooked;
	Seat(int seatNumber, int rowNumber, SeatType type, double price){
		this.seatNumber=seatNumber;
		this.rowNumber=rowNumber;
		this.type=type;
		this.price=price;
		this.isBooked=false;
	}
	public boolean bookSeat(){
		if(!(isBooked))
			isBooked=true;
			return isBooked;
	}
	public void display(){
		System.out.printf("Seat Number:%d\nRow Number:%d\nSeat price:%f\nBook Status:%b",seatNumber, rowNumber, price, isBooked);
	}
}