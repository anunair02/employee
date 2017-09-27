package carRenatl;

import java.util.HashMap;

public class CalculateDistance {

	public static int getDistance(Trip trip) {
		HashMap<String, Integer> distance = new HashMap<String, Integer>();
		for (CityDistance city : CityDistance.values()) {
			distance.put(city.toString(), city.getDistance());
		}

		int totalDistance = distance.get(trip.getFromCity()) + distance.get(trip.getToCity());
		return totalDistance;

	}

}
