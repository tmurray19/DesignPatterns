package strategy;

public class RainWeatherStrategy implements Strategy {

	@Override
	public void giveOutfit(String weather) {
		System.out.println("The weather is " + weather + ", so Don't forget to bring an umbrella.");
	}

}
