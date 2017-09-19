package factoryStory1;

public class BangaloreCity implements ParticipatingCities{
	int playersFromBangalore=15;
		private String cityName;
		public BangaloreCity()
		{
			cityName="Bangalore";
		}

	@Override
	public String getCityName(String name) {
		
		return cityName;
	}

}
