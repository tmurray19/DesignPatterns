package strategy;

public class WeatherContext {
	private Strategy weather;
	
	//Constructor
	// Make strategy in this class equal to the one passed through 
	// the constructor.
	public WeatherContext(Strategy weather) {
		this.weather = weather;
	}
	
	// Then you call that strategy's giveOutfit function
	// Using this function
	public void giveOutfit(String w) {
		weather.giveOutfit(w);
	}
}
