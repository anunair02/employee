package factoryStory1;

public class CityFactory extends  AbstractCityFactory{

	@Override
	public ParticipatingCities getName(String city) {
	if(city==null)
		return null;
	if(city.equalsIgnoreCase("pune"))
	{
		return new PuneCity();
	}else if(city.equalsIgnoreCase("bangalore"))
	{
		return new BangaloreCity();
	}else if(city.equalsIgnoreCase("mumbai"))
	{
		return new MumbaiCity();
	}
	return null;
	}

	
}
