package visitor;

public class VisitorDriver {
	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
