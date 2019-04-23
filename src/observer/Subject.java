package observer;
import java.util.List;
import java.util.ArrayList;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public int getState() {
		return this.state;
	}
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void notifyAllObservers() {
		for(Observer o: observers) {
			o.update();
		}
	}
	
}
