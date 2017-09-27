package carRenatl;

class Bus extends Vehicle {

	public Bus(String vehicleName, String feature, int noOfPassengers) {
		super(vehicleName, feature, "Diesel",noOfPassengers);

	}

	@Override
	double getCharges() {
		double fuelPricePlusExtraCharges;
		int totalSeats=40;
if(this.noOfPassengers>totalSeats)
{
	double chargesForSeat=(this.noOfPassengers-totalSeats) * ExtraCharges.PERHEAD.getCharge();
	
	if (this.feature.equalsIgnoreCase("ac")) {
		double d = ExtraCharges.DISCOUNT.getCharge()
				* (ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge()+ chargesForSeat );
		
		fuelPricePlusExtraCharges = ((ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge() + chargesForSeat ) - d);
	} else {
		double d = ExtraCharges.DISCOUNT.getCharge() * (ExtraCharges.DIESEL.getCharge()+ chargesForSeat);
		fuelPricePlusExtraCharges = ((ExtraCharges.DIESEL.getCharge()+chargesForSeat) - d);
	}

}else
{
		if (this.feature.equalsIgnoreCase("ac")) {
			double d = ExtraCharges.DISCOUNT.getCharge()
					* (ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge());
			fuelPricePlusExtraCharges = ((ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge()) - d);
		} else {
			double d = ExtraCharges.DISCOUNT.getCharge() * ExtraCharges.DIESEL.getCharge();
			fuelPricePlusExtraCharges = (ExtraCharges.DIESEL.getCharge() - d);
		}

		
	}
return fuelPricePlusExtraCharges;
	}

}