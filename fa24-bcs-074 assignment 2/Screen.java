public class Screen{
	private int screenNumber;
	private String movieTitle;
	private Seat[][] seats;
	Screen(int screenNumber, String movieTitle, int rows, int cols){
		this.screenNumber=screenNumber;
		this.movieTitle=movieTitle;
		seats=new Seat[rows][cols];
	}
	public boolean bookSeat(int row, int col, Customer customer){
		return (seats[row][col].bookSeat());
	}
	public void displayScreen(){
		System.out.printf("Screen Number:%d\nMovie Title:%s\n",screenNumber,movieTitle);
	}
}