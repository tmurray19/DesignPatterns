package abstract_factory;

public class AbstractFactoryDriver {
	public static void main(String[] args) {
		AbstractFactory f = FactoryCreator.getFactory(false);
		
		Shape square = f.getShape("Square");
		square.draw();
		
		Shape circle = f.getShape("Circle");
		circle.draw();
		
		f = FactoryCreator.getFactory(true);		
		
		Shape roundedSquare = f.getShape("Square");
		roundedSquare.draw();
		
		Shape oval = f.getShape("Circle");
		oval.draw();
		
	}
}
