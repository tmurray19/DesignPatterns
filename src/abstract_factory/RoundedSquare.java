package abstract_factory;

public class RoundedSquare implements Shape {

	@Override
	public void draw() {
		System.out.println("Draw a square, but curve the corners.");
	}

}
