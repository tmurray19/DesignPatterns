package observer;

public class ObserverDriver {
	public static void main(String[] args) {
		Subject s = new Subject();
		
		new BinaryObserver(s);
		new OctaObserver(s);
		new HexaObserver(s);
		
		System.out.println("We will now update the value to be 15:");
		s.setState(15);
		

		System.out.println("Now we will update the value to be 47:");
		s.setState(47);
		
	}
}
