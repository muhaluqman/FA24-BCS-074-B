public class Teacher extends Person{
	private String teacherID;
	Teacher(int age, String name, String teacherID){
		super(age, name);
		this.teacherID=teacherID;
	}
	@Override
	public String toString(){
		return super.toString()+String.format("Teacher ID: %s",teacherID);
	}
	boolean equals(Teacher obj){
		if(teacherID.equals(obj.teacherID)){
			return true;
		}else{
			return false;
		}
	}
}