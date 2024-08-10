public class Snakes extends Reptiles
{
	public Snakes(String name, String birthType)
	{
		super(name, birthType);
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Categorization: Snakes");
	}
}