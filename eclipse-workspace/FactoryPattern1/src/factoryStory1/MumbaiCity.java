package factoryStory1;

public class MumbaiCity implements ParticipatingCities{
	int playersFromMumbai=6;
private String cityName;
public MumbaiCity()
{
cityName="Mumbai";	
}
	
	@Override
	public String getCityName(String name) {
		// TODO Auto-generated method stub
		return cityName;
	}

}
