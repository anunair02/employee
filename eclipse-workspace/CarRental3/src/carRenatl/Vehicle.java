package carRenatl;

public abstract class Vehicle {

	String vehicleName;
	String feature;
	String fuelType;
	int noOfPassengers;
	int totalSeats;
	static int toll1;
	static int toll2;
	
	public Vehicle(String vehicleName, String feature, String fuelType, int noOfPassengers, int totalSeats,int toll1, int toll2) {
		super();
		this.vehicleName = vehicleName;
		this.feature = feature;
		this.fuelType = fuelType;
		this.noOfPassengers=noOfPassengers;
		this.totalSeats=totalSeats;
		Vehicle.toll1=toll1;
		Vehicle.toll2=toll2;
	}

	public static int getToll1() {
		return toll1;
	}

	public void setToll1(int toll1) {
		Vehicle.toll1 = toll1;
	}

	public static int getToll2() {
		return toll2;
	}

	public void setToll2(int toll2) {
		Vehicle.toll2 = toll2;
	}

	abstract double getCharges();
}
