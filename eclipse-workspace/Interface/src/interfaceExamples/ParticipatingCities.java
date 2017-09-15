package interfaceExamples;

public interface ParticipatingCities {

	public void totalPlayers(int numberOfPlayers);
	 
	int totalMatches=14;
	int pointsOffered=10;
	 
}

	class Players implements ParticipatingCities
	{

		@Override
		public void totalPlayers(int numberOfPlayers) {
			int getPlayers=0;
			getPlayers=getPlayers+ Pune.playersFromPune + Mumbai.playersOfMumbai + Bangalore.playersFromBangalore;
			System.out.println("Total Players from all cities are : " +getPlayers);
		}

		
	}
 
