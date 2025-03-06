package week_4;
public class Person{
	String name;
	String role;
	Address address;
	Person(String name, String role, Address address){
		this.name=name;
		this.role=role;
		this.address=address;
	}
	Person(Person other){
		this.name=other.name;
		this.role=other.role;
		this.address=other.address;
	}
	void showPersonDetails(){
		System.out.println("Name: "+name);
		System.out.println("Role: "+role);
		address.showAddress();

	}
	boolean equals(Person p1){
		if(p1.name==this.name){
			return true;
		}else{
			return false;
		}

	}
	void setName(String name){
		this.name=name;
	}
	void setRole(String role){
		this.role=role;
	}

	String getName(){
		return this.name;
	}
	String getRole(){
		return this.role;
	}

	
}