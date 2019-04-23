package factory;

public class FactoryDriver {
	
	public static void main(String[] args) {
		ShapeFactory s = new ShapeFactory();
		
		Shape square = s.getShape("Square");
		square.draw();
		
		Shape circle = s.getShape("Circle");
		circle.draw();
		
		Shape triangle = s.getShape("Triangle");
		triangle.draw();
		
	}
}
