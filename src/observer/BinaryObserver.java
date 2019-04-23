package observer;

public class BinaryObserver extends Observer {

	
	
	public BinaryObserver(Subject s) {
		this.s = s;
		this.s.addObserver(this);
		
	}

	@Override
	public void update() {
		System.out.println("Binary value: " + Integer.toBinaryString(s.getState()));
	}

}
