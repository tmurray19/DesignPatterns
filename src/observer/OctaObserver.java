package observer;

public class OctaObserver extends Observer{
	
	public OctaObserver(Subject s) {
		this.s = s;
		s.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Octal string: " + Integer.toOctalString(s.getState()));
	}

}
