public class Supervisor extends Person{
	private int experience;
	Supervisor(String name, int experience){
		super(name);
		this.experience=experience;
	}
	int getExperience(){
		return this.experience;
	}
	String getName(){
		return super.getName();
	}
	void setExperience(int experience){
		this.experience=experience;
	}
	public String toString(){
		return String.format("Supervisor: Name: %s, Experience %d years",getName(),experience);
	}
}