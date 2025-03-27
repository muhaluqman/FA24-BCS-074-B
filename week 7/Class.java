public class Class{
	private String classname;
	private String classcode;
	Student students[5];
	Teacher teacher;
	Class(String classname, String classcode, Teacher teacher, Student students[]){
		this.classname=classname;
		this.classcode=classcode;
		this.teacher=teacher;
		this.students=students;
	}
	public String toString(){
		return String.format("Class name: %s\nClass code: %s",classname, classcode);
	}
}