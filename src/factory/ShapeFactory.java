package factory;

public class ShapeFactory {
	public Shape getShape(String ShapeType) {
		if(ShapeType == null) {
			return null;
		}
		
		if(ShapeType.contentEquals("Circle")) {
			return new Circle();
		}
		
		if(ShapeType.contentEquals("Square")) {
			return new Square();
		}
		
		if(ShapeType.contentEquals("Triangle")) {
			return new Triangle();
		}
		
		return null;
	}
}
