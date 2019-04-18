package interface_example;

public class InterfaceDriver {
	public static void main(String[] args) {
		Pig p = new Pig();
		Bat b = new Bat();
		
		System.out.println("PIG:");
		p.sound();
		p.move();
		
		System.out.println("BAT:");
		b.sound();
		b.move();
		b.fly();

	}
}
