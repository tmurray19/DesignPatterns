package observer;

public class HexaObserver extends Observer{

	public HexaObserver(Subject s) {
		this.s = s;
		s.addObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("Hexadecimal string: " + Integer.toHexString(s.getState()));
	}

}
