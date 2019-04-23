package factory;

public class ShapeFactory {
	public Shape getShape(String s) {
		if(s == null) {
			return null;
		}
		
		if(s.contentEquals("Circle")) {
			return new Circle();
		}
		
		if(s.contentEquals("Square")) {
			return new Square();
		}
		
		if(s.contentEquals("Triangle")) {
			return new Triangle();
		}
		
		return null;
	}
}
