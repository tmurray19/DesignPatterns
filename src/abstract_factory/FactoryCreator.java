package abstract_factory;

public class FactoryCreator {
	
	public static AbstractFactory getFactory(boolean rounded){
		if(rounded==true) {
			return new RoundedShapeFactory();
		}
		else {
			return new ShapeFactory();
		}
	}
}
