package factor_pattern;

public class AnimalFactory {
	
	public Animal createAnimal (String animalType) {
		animalType = animalType.toLowerCase();
		switch(animalType) {
		case "dog":
			return new Dog();
		
		case "cat":
			return new Cat();
			
		}
		return null;
			
		
		
	}
	

}
