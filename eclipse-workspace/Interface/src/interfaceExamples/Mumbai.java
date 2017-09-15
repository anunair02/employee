package interfaceExamples;

public interface Mumbai extends ParticipatingCities {

	int playersOfMumbai=15;
	public void scoredPointsMumbai(int matchesWon,int points);
}
class MumbaiPoints implements Mumbai{

	@Override
	public void totalPlayers(int numberOfPlayers) {
		
		System.out.println("Total players from Mumbai : "+ playersOfMumbai);
	}

	@Override
	public void scoredPointsMumbai(int matchesWon,int points) {
		int won=2;
		int totalPointsOfMumbai=won*pointsOffered;
		System.out.println("Matches won : "+won+" \nTotal points scored by Mumbai is : "+ totalPointsOfMumbai);
	}

	
	
}