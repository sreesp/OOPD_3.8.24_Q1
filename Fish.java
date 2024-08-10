public class Fish implements Animal
{
	private String name;
	private String birthType;
	
	public Fish(String name, String birthType) {
		super();
		this.name = name;
		this.birthType = birthType;
	}

	@Override
	public String getDetails()
	{
		return name + " " + birthType;
	}

	@Override
	public void displayDetails()
	{
		System.out.println("Details:");
		System.out.println("Name: " + name);
		System.out.println("BirthType: " + birthType);
		System.out.println("Group: Fish");
	}
}