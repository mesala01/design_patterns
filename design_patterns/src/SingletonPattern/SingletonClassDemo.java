package SingletonPattern;

public class SingletonClassDemo {

	public static void main(String[] args) {
		/* The Singleton pattern is a creational pattern that ensures that only one 
		 * instance of a class is created.
		 * This class provides a way to access its only object 
		 * which can be accessed directly without need to instantiate the object of the class.
		 */
		Database db =  Database.getInstance();
		db.connect();
		

	}

}
