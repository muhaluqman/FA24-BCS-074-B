public class Main{
	public static void main(String args[]){
		Campus c1=new Campus("CUI Lahore","Aslam","Lahore","Street 6",new Departments("CS","Amir",new Lab("L01","Hassan",new Systems("PCL01","i7",8,512))) );
		c1.ShowCampus();
	}
	
}