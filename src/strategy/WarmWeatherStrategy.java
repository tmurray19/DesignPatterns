package strategy;

public class WarmWeatherStrategy implements Strategy {

	@Override
	public void giveOutfit(String weather) {
		
		System.out.println("The weather is " + weather + ", so you should wear something light and breezy.");
		
	}

}
