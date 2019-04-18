package interface_example;

public class Bat implements WingedAnimal{

	public void sound() {
		System.out.println("I use Sonar.\n");
	}

	
	public void move() {
		System.out.println("I can fly too.\n");
	}
	 
	
	public void fly() {
		System.out.println("I use my wings to fly.\n");
	}

}
