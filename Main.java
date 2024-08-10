
public class Main 
{
	public static void main(String[] args) 
	{
		Animal mammal1 = new Mammals("Elephant", "birth live");
		Animal mammal2 = new Mammals("Platypus", "laid egg");

		Animal fish1 = new Fish("Salmon", "laid egg");
		Animal fish2 = new Fish("Guppy", "birth live");

		Animal snake1 = new Snakes("Cobra", "laid egg");
		Animal snake2 = new Snakes("Boa Constrictor", "birth live");
		
		Animal reptile1 = new Reptiles("Komodo Dragon", "laid egg");
		Animal reptile2 = new Reptiles("Boa Constrictor", "birth live");

		Animal domesticAnimal1 = new DomesticAnimals("Dog", "birth live");
		Animal domesticAnimal2 = new DomesticAnimals("Chicken", "laid egg");
		

		String m1Details = mammal1.getDetails();
		mammal1.displayDetails();
		System.out.println("\n");
		
		String m2Details = mammal2.getDetails();
		mammal2.displayDetails();
		System.out.println("\n");
		
		String f1Details = fish1.getDetails();
		fish1.displayDetails();
		System.out.println("\n");
		
		String f2Details = fish2.getDetails();
		fish2.displayDetails();
		System.out.println("\n");
		
		String s1Details = snake1.getDetails();
		snake1.displayDetails();
		System.out.println("\n");
		
		String s2Details = snake2.getDetails();
		snake2.displayDetails();
		System.out.println("\n");
		
		String r1Details = reptile1.getDetails();
		reptile1.displayDetails();
		System.out.println("\n");
		
		String r2Details = reptile2.getDetails();
		reptile2.displayDetails();
		System.out.println("\n");
		
		String da1Details = domesticAnimal1.getDetails();
		domesticAnimal1.displayDetails();
		System.out.println("\n");
		
		String da2Details = domesticAnimal2.getDetails();
		domesticAnimal2.displayDetails();
	}
}
