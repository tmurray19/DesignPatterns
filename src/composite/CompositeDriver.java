package composite;

public class CompositeDriver {

	public static void main(String[] args) {
		// Creating the leafs of the composite design pattern
		BaseComponent leafA = new Leaf1(1, "This is the First Leaf.\n");
		
		BaseComponent leafB = new Leaf2(2, "This is the Second Leaf.\n");
		
		// Creating the composite element to hold them all
		CompositeElement e = new CompositeElement(3, "This is the Composite Element.\n");
		
		// Adding and showing the components
		e.addComponent(leafA);
		e.addComponent(leafB);
		e.printName();
	}

}
