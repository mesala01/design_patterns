package factory_pattern;

public class AnimalFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an Animal Factory
		AnimalFactory animalFactory = new AnimalFactory();
		//Creating an animal of type Dog
		Animal dog = animalFactory.createAnimal("dog");
		//Creating an animal of type Cat
		Animal cat = animalFactory.createAnimal("cat");
		dog.speak();
		cat.speak();
			

	}

}
