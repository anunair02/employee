package carRenatl;

public abstract class Vehicle {

	String vehicleName;
	String feature;
	String fuelType;
	public Vehicle(String vehicleName, String feature, String fuelType) {
		super();
		this.vehicleName = vehicleName;
		this.feature = feature;
		this.fuelType = fuelType;
		
		
	}
	abstract double getFuelPrice();
}
