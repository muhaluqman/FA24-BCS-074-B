public class Lab{
	
	String name;
	Person staff;
	Systems pc[]=new Systems[50];
	Lab(String name, String pname, Systems pc){
		staff=new Person(pname,"Lab Staff");
		this.name=name;
		this.pc[0]=pc;
		staff.name=pname;
		staff.role="Lab Staff";
	}
}