package abstract_factory;

public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Use a compass to draw the circle.");
	}
}
