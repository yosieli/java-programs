package udemy.classes.objects;

public class Earth {
	
	public Earth() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Human feven = new Human("feven", 20);
		feven.speak();
		Bike honda= new Honda();  
		honda.run();  
	}
	
	Earth get()
	{
		System.out.println(this + "hiii");
		return null;
		
	}
	
}
