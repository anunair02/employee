package carRenatl;

public enum CityDistance {
	PUNE(0), MUMBAI(200), BANGALORE(1000), DELHI(2050), CHENNAI((int) 1234.5);

	private int distance;

	CityDistance(int distance) {
		this.distance = distance;
	}

	int getDistance() {
		return distance;
	}
}
