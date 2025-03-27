public class Principal extends Person{
	private int experience;
	public Principal(int age, String name, int expereince){
		super(age, name);
		this.experience=expereince;
	}
	@Override
	public String toString(){
		return super.toString()+String.format("Experience: %d", experience);
	}
}