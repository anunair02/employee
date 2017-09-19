package factoryStory1;

public class PuneCity implements ParticipatingCities{
	int playersFromPune=10;
	private String cityName;
	public PuneCity()
	{
		cityName="Pune";
	}

	

	@Override
	public String getCityName(String name) {
		// TODO Auto-generated method stub
		return cityName;
		
	}

}
