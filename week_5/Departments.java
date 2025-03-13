public class Departments{
	
	String name;
	Lab labs[]=new Lab[50];
	Person incharge;
	Departments(String name, String pname, Lab labs){
		incharge=new Person(pname,"Department incharge");
		this.name=name;
		incharge.name=pname;
		incharge.role="Department Incharge";
		this.labs[0]=labs;
	}
}