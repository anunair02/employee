package factoryStory1;

public class Champions {

	public static void main(String[] args) {
		AbstractCityFactory cityFactory=HostingCity.getCityName("city");
		String cityName="pune";
		ParticipatingCities c=cityFactory.getName(cityName);
		System.out.println(c.getCityName(cityName));

	}

}
