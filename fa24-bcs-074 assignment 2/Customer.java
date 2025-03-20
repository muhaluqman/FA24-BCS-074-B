public class Customer{
	private int customerId;
	private String name;
	private String phoneNumber;
	private String email;
	Customer(int customerId, String name, String phoneNumber, String email){
		this.customerId=customerId;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	public boolean equals(Customer obj){
		if(this.customerId==obj.customerId){
			return true;
		}else{
			return false;
		}
	}
	public void displayCustomer(){
		System.out.println("Customer ID:"+customerId);
		System.out.println("Customer Name:"+name);
		System.out.println("Customer Phone Number:"+phoneNumber);
		System.out.println("Customer email:"+email);
	}
}