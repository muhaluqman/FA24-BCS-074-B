public class Person{
	private String name;
	Person(String name){
		this.name=name;
	}
	String getName(){
		return this.name;
	}
	void setName(String name){
		this.name=name;
	}
	public String toString(){
		return String.format(" Name: %s",name);
	}
}