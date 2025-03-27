public class School{
	private String name;
	private String address;
	Class[] classes;
	Principal principal;
	School(String name, String address, Class classes,int age, String name, int expereince){
		this.name=name;
		this.address=address;
		this.classes=classes;
		this.principal=new Principal(age, name, experience);
	}
}