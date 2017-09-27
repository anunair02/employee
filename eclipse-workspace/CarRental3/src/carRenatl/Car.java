package carRenatl;

class Car extends Vehicle {

	public Car(String vehicleName, String feature, String fuelType, int noOfPassengers) {
		super(vehicleName, feature, fuelType, noOfPassengers,5,100,0);

	}

	@Override
	double getCharges() {
		double fuelPricePlusExtraCharges = 0;
		
	/*	if (noOfPassengers > totalSeats) {
			double chargesForSeat = (noOfPassengers - totalSeats) * ExtraCharges.PERHEAD.getCharge();
			if (fuelType.equalsIgnoreCase("petrol")) {
				if (feature.equalsIgnoreCase("ac")) {
					fuelPricePlusExtraCharges = ExtraCharges.PETROL.getCharge() + ExtraCharges.AC.getCharge()
							+ chargesForSeat;

				} else {
					fuelPricePlusExtraCharges = ExtraCharges.PETROL.getCharge() + chargesForSeat;
				}
			} else {
				if (feature.equalsIgnoreCase("ac")) {
					fuelPricePlusExtraCharges = ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge()
							+ chargesForSeat;
				} else {
					fuelPricePlusExtraCharges = ExtraCharges.DIESEL.getCharge() + chargesForSeat;
				}
			}
		}

		else{}*/

		
			if (fuelType.equalsIgnoreCase("petrol")) {
				if (feature.equalsIgnoreCase("ac")) {
					fuelPricePlusExtraCharges = ExtraCharges.PETROL.getCharge() + ExtraCharges.AC.getCharge();

				} else {
					fuelPricePlusExtraCharges = ExtraCharges.PETROL.getCharge();
				}
			} else {
				if (feature.equalsIgnoreCase("ac")) {
					fuelPricePlusExtraCharges = ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge();
				} else {
					fuelPricePlusExtraCharges = ExtraCharges.DIESEL.getCharge();
				}
			}
		

		return fuelPricePlusExtraCharges;

	}

}