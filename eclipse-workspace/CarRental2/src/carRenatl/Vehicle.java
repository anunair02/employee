package carRenatl;

public abstract class Vehicle {

	String vehicleName;
	String feature;
	String fuelType;
	int noOfPassengers;
	
	public Vehicle(String vehicleName, String feature, String fuelType, int noOfPassengers) {
		super();
		this.vehicleName = vehicleName;
		this.feature = feature;
		this.fuelType = fuelType;
		this.noOfPassengers=noOfPassengers;

	}

	abstract double getCharges();
}
