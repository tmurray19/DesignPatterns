package strategy;

public class StrategyDriver {

	public static void main(String[] args) {
		String warmWeather = "Warm (Passed from driver)";
		
		if(warmWeather.contentEquals("Warm (Passed from driver)")) {
			WeatherContext c = new WeatherContext(new WarmWeatherStrategy());
			c.giveOutfit(warmWeather);
		}
		String coldWeather = "Cold (Passed from driver)";
		
		if(coldWeather.contentEquals("Cold (Passed from driver)")) {
			WeatherContext c = new WeatherContext(new ColdWeatherStrategy());
			c.giveOutfit(coldWeather);
		}
		String wetWeather = "Wet (Passed from driver)";
		
		if(wetWeather.contentEquals("Wet (Passed from driver)")) {
			WeatherContext c = new WeatherContext(new RainWeatherStrategy());
			c.giveOutfit(wetWeather);
		}

	}

}
