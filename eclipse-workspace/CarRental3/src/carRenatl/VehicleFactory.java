package carRenatl;

public class VehicleFactory {

	public Vehicle getVehicle(String vehicleType) {
		if (vehicleType.equalsIgnoreCase("bus")) {
			return (new Bus("Tata Skyline", "AC",45));
		} else if (vehicleType.equalsIgnoreCase("car")) {
			return (new Car("Swift", "Non-AC", "Diesel",7));
		} else
			return (new SUV("Mahindra XUV 500", 6));

	}
}
