public class Cinema{
	private String name;
	private String location;
	private Screen[] screens;
	Cinema(String name, String location, int totalScreens){
		this.name=name;
		this.location=location;
		screens=new Screen[totalScreens];
	}
	public void addScreen(int index, Screen screen){
		this.screens[index]=screen;
	}
	public void displayCinema(){
		System.out.println("Cinema Name:"+name);
		System.out.println("Cinema location:"+location);
		for(int i=0;i<screens.length;i++){
			if(screens[i]!=null){
				screens[i].displayScreen();
			}
		}
	}
}