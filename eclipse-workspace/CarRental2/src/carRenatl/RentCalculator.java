package carRenatl;

public class RentCalculator {

	public static double rent(Trip trip, Vehicle vehicle) {
		int tripTo = CalculateDistance.getDistance(trip);
		double rent = tripTo * vehicle.getCharges();
		return rent;

	}
}
