package SingletonPattern;

public class Database {
	
	//Creating a private instance of the SingletonClass
	private static Database instance = new Database();
	
	// creating a private constructor to restrict access
	private Database() {
		
	}
	
	//Create a method to give public access to the single instance
	public static Database getInstance() {
		return instance;
	}
	
	//Creating a public connection method
	public void connect() {
		System.out.println("You are now connected");
	}
	

}
