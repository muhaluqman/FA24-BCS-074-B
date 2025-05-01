public class Owner extends Person{
	private int ownerID;
	static int IDset=1;
	Owner(String name){
		super(name);
		ownerID=IDset;
		IDset=IDset+1;
	}
	int getOwnerID(){
		return this.ownerID;
	}
	@Override
	String getName(){
		return super.getName();
	}
	public String toString(){
		return String.format(" Name: %s, Owner ID: 0%03d",super.getName(),ownerID);
	}
}