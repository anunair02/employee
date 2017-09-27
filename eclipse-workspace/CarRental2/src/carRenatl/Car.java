package carRenatl;

class Car extends Vehicle {

	public Car(String vehicleName, String feature, String fuelType, int noOfPassengers) {
		super(vehicleName, feature, fuelType, noOfPassengers);

	}

	@Override
	double getCharges() {
		double fuelPricePlusExtraCharges = 0;
		double totalSeats = 5;
		if (this.noOfPassengers > totalSeats) {
			double chargesForSeat = (this.noOfPassengers - totalSeats) * ExtraCharges.PERHEAD.getCharge();
			if (this.fuelType.equalsIgnoreCase("petrol")) {
				if (this.feature.equalsIgnoreCase("ac")) {
					fuelPricePlusExtraCharges = ExtraCharges.PETROL.getCharge() + ExtraCharges.AC.getCharge()
							+ chargesForSeat;

				} else {
					fuelPricePlusExtraCharges = ExtraCharges.PETROL.getCharge() + chargesForSeat;
				}
			} else {
				if (this.feature.equalsIgnoreCase("ac")) {
					fuelPricePlusExtraCharges = ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge()
							+ chargesForSeat;
				} else {
					fuelPricePlusExtraCharges = ExtraCharges.DIESEL.getCharge() + chargesForSeat;
				}
			}
		}

		else

		{
			if (this.fuelType.equalsIgnoreCase("petrol")) {
				if (this.feature.equalsIgnoreCase("ac")) {
					fuelPricePlusExtraCharges = ExtraCharges.PETROL.getCharge() + ExtraCharges.AC.getCharge();

				} else {
					fuelPricePlusExtraCharges = ExtraCharges.PETROL.getCharge();
				}
			} else {
				if (this.feature.equalsIgnoreCase("ac")) {
					fuelPricePlusExtraCharges = ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge();
				} else {
					fuelPricePlusExtraCharges = ExtraCharges.DIESEL.getCharge();
				}
			}
		}

		return fuelPricePlusExtraCharges;

	}

}