public class DomesticAnimals extends Mammals
{

	public DomesticAnimals(String name, String birthType)
	{
		super(name, birthType);
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Categorization: Domestic Animal");
	}
	
}