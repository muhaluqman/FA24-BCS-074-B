public class Address{
	String city;
	String street;
	Address(){
		this.city="Lahore";
		this.street="Pakistan";
	}
	Address(String city, String street){
		this.city=city;
		this.street=street;
	}
	Address(Address other){
		this.city=other.city;
		this.street=other.street;
	}
	void showAddress(){
		System.out.println("Street:"+street);
		System.out.println("City:"+city);
	}
	String getCity(){
		return city;
	}
	String getStreet(){
		return street;
	}
	void setStreet(String street){
		this.street=street;
	}
	void setCity(String city){
		this.city=city;
	}
	public boolean equals(Address a1){
		if(a1.city==this.city&&a1.street==this.street){
			return true;
		}else{
			return false;
		}
	}



}