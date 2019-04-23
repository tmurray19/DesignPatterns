package abstract_factory;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Draw 4 lines so that they are at right angles to each other.");
	}

}
