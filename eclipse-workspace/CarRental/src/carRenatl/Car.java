package carRenatl;

class Car extends Vehicle {

	public Car(String vehicleName, String feature, String fuelType) {
		super(vehicleName, feature, fuelType);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getFuelPrice() {
		double fuelPrice;
		if (this.fuelType.equalsIgnoreCase("petrol")) {
			if (this.feature.equalsIgnoreCase("ac")) {
				fuelPrice = 9 + 2;

			} else {
				fuelPrice = 9;
			}
		} else {
			if (this.feature.equalsIgnoreCase("ac")) {
				fuelPrice = 8 + 2;
			} else {
				fuelPrice = 8;
			}
		}
		return fuelPrice;
	}

}