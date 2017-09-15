package interfaceExamples;

public interface Pune extends ParticipatingCities {
	public void scoredPointsPune(int matchesWon,int points);
	/*public void soloPlayersFromPune(int soloPlayers);
	public void teamPlayersFromPune(int teamPlayers);*/
	int playersFromPune=10;
}

 class PunePoints implements Pune
{
	 @Override
		public void totalPlayers(int numberOfPlayers) {
			System.out.println("Total players from Pune : "+playersFromPune);
		}
	
	@Override
	public void scoredPointsPune(int matchesWon,int points) {
		int won=4;
		int totalPointsOfPune=won*pointsOffered;
		System.out.println("Matches won "+ won+ " \nTotal points scored by Pune is : "+ totalPointsOfPune);
		
	}

	/*@Override
	public void soloPlayersFromPune(int soloPlayers) {
		int solo=6;
		int team=4;
		
		
	}

	@Override
	public void teamPlayersFromPune(int teamPlayers) {
		// TODO Auto-generated method stub
		
	}*/

	
	
	
}