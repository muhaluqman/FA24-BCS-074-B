package week_4;
public class Date{
	private int day;
	private int month;
	private int year;
	Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	Date(){
		this.day=01;
		this.month=01;
		this.year=2001;
	}
	void showDate(){
		System.out.println("Date is: "+day+"\\"+month+"\\"+year);
	}
	Date(Date other){
		this.day=other.day;
		this.month=other.month;
		this.year=other.year;
	}
	public boolean equals(Date d1){
		if(d1.day==this.day&&d1.month==this.month&&d1.year==this.year)
		{
			return true;
		}else{
			return false;
		} 
	}
	int getDay(){
		return this.day;
	}
	int getMonth(){
		return this.month;
	}
	int getYear(){
		return this.year;
	}
	void setDay(int day){
		this.day=day;
	}
	void setMonth(int month){
		this.month=month;
	}
	void setYear(int year){
		this.year=year;
	}
}