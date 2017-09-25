package carRenatl;

class Bus extends Vehicle {

	
	public Bus(String vehicleName, String feature) {
		super(vehicleName, feature, "diesel");
		// TODO Auto-generated constructor stub
	}

	

	@Override
	double getFuelPrice() {
		double fuelPrice;
		double discount;
		if (this.feature.equalsIgnoreCase("ac")) {
			discount = 0.02 * (8 + 2);
			fuelPrice =  ((8 + 2) - discount);
		} else {
			discount = 0.02 * 8;
			fuelPrice = (8 - discount);
		}
		return fuelPrice;
	}

}