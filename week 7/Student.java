public class Student extends Person{
	private String rollnumber;
	Student(int age, String name, String rollnumber){
		super(age, name);
		this.rollnumber=rollnumber;
	}
	@Override
	public String toString(){
		return super.toString()+String.format("Roll number: %s",rollnumber);
	}
	boolean equals(Student obj){
		if(rollnumber.equals(obj.rollnumber)){
			return true;
		}else{
			return false;
		}
	}

}