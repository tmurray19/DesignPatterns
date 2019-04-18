package singleton;

public class Singleton {
	// Create a private, static single instance of the singleton
	// Static so it can only be instanced/changed once
	// Private so only the Singleton class can access it
	private static Singleton single_instance = null;
	
	public String s;
	
	
	// Private constructor
	private Singleton() {
		s = "This is the private singleton constructor.\n";
	}
	
	// getInstance method to return the single instance of the singleton class
	public static Singleton getInstance() {
		// Initalises single instance of Singleton if it is null
		if(single_instance == null)
			single_instance = new Singleton();
		// Returns single instance
		return single_instance;
	}
}
