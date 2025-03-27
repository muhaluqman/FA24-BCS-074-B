public class Person{
	private int age;
	private String name;
	Person(int age, String name){
		this.age=age;
		this.name=name;
	}
	int Getage(){
		return age;
	}
	String name(){
		return name;
	}
	public String toString(){
		return String.format("Name: %s\nAge: %d\n",name, age);
	}
}