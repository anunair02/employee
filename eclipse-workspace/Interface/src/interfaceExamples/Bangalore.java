package interfaceExamples;

public interface Bangalore extends ParticipatingCities {
	int playersFromBangalore=10;
	public void scoredPointsBangalore(int matchesWon,int points);
}
class BangalorePoints implements Bangalore{

	@Override
	public void totalPlayers(int numberOfPlayers) {
		
		System.out.println("Total players from Bangalore : "+playersFromBangalore);
	}

	@Override
	public void scoredPointsBangalore(int matchesWon,int points) {
		int won=2;
		int totalPointsOfBangalore=won*pointsOffered;
		System.out.println("Matches won : "+won+ "\nTotal points Scored by Bangalore : "+totalPointsOfBangalore);
		
	}

	
	
}