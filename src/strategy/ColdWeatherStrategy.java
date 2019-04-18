package strategy;

public class ColdWeatherStrategy implements Strategy {

	@Override
	public void giveOutfit(String weather) {
		// TODO Auto-generated method stub
		System.out.println("The weather is " + weather + ", so you should wear a heavy coat to keep you warm.");

	}

}
