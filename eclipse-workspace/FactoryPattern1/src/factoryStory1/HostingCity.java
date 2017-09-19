package factoryStory1;

public class HostingCity {
public static AbstractCityFactory getCityName(String city) {
	if(city.equalsIgnoreCase("city"))
	return new CityFactory();
	return null;
}

}
