package carRenatl;

class Bus extends Vehicle {

	public Bus(String vehicleName, String feature, int noOfPassengers) {
		super(vehicleName, feature, "Diesel",noOfPassengers,40,0,0);
		
	}

	@Override
	double getCharges() {
		double fuelPricePlusExtraCharges;
		
/*if(noOfPassengers>totalSeats)
{
	double chargesForSeat=(noOfPassengers-totalSeats) * ExtraCharges.PERHEAD.getCharge();
	
	if (feature.equalsIgnoreCase("ac")) {
		double d = ExtraCharges.DISCOUNT.getCharge()
				* (ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge()+ chargesForSeat );
		
		fuelPricePlusExtraCharges = ((ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge() + chargesForSeat ) - d);
	} else {
		double d = ExtraCharges.DISCOUNT.getCharge() * (ExtraCharges.DIESEL.getCharge()+ chargesForSeat);
		fuelPricePlusExtraCharges = ((ExtraCharges.DIESEL.getCharge()+chargesForSeat) - d);
	}

}else{}*/

		if (feature.equalsIgnoreCase("ac")) {
			double d = ExtraCharges.DISCOUNT.getCharge()
					* (ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge());
			fuelPricePlusExtraCharges = ((ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge()) - d);
		} else {
			double d = ExtraCharges.DISCOUNT.getCharge() * ExtraCharges.DIESEL.getCharge();
			fuelPricePlusExtraCharges = (ExtraCharges.DIESEL.getCharge() - d);
		}

		
	
return fuelPricePlusExtraCharges;
	}

}