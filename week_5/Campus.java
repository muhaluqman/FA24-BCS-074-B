public class Campus{
	String name;
	Person director;
	Address campusAdd;
	Departments depts[]=new Departments[10];
	Campus(String name, String pname, String city, String street,Departments depts){
		director=new Person(pname,"Campus Director");
		campusAdd=new Address(city, street);
		this.depts[0]=depts;
		this.name=name;
		director.name=pname;
		director.role="Campus Director";
		campusAdd.city=city;
		campusAdd.street=street;
	}
	public void ShowCampus(){
		System.out.println("Campus Name:"+name);
		System.out.println("Campus Director:"+director);
		System.out.println("Campus Address:"+campusAdd.city+","+campusAdd.street);
		for(int i=0;i<10;i++){
			if(depts[i]!=null){
				System.out.println("Department Name:"+depts[i].name);
				System.out.println("Department incharge:"+depts[i].incharge.name);
				for(int j=0;j<50;j++){
					if(depts[i].labs[j]!=null){
						System.out.println("Lab Name:"+depts[i].labs[j].name);
						System.out.println("Lab Staff:"+depts[i].labs[j].staff.name);
						for(int k=0;k<50;k++){
							if(depts[i].labs[j].pc[k]!=null){
								System.out.println("PC ID:"+depts[i].labs[j].pc[k].Id);
								System.out.println("PC Version:"+depts[i].labs[j].pc[k].Version);
								System.out.println("PC ram:"+depts[i].labs[j].pc[k].Ram);
								System.out.println("PC disk:"+depts[i].labs[j].pc[k].diskSpace);

			}
		}

			}
		}

			}
		}
	}
}