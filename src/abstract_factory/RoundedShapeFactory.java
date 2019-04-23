package abstract_factory;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {

		if(shapeType.contentEquals("Circle")) {
			return new Oval();
		}
		if(shapeType.contentEquals("Square")) {
			return new RoundedSquare();
		}
		
		return null;
	}

}
