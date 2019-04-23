package factory;

public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Draw three lines so that the angle between all the line add up to 180°.");
	}

}
