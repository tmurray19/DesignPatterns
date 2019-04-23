package abstract_factory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.contentEquals("Circle")) {
			return new Circle();
		}
		if(shapeType.contentEquals("Square")) {
			return new Square();
		}
		
		
		return null;
	}

}
