package carRenatl;

class SUV extends Vehicle {

	public SUV(String vehicleName, int noOfPassengers) {
		super(vehicleName, "AC", "Diesel", noOfPassengers, 8,100,150);

	}

	@Override
	double getCharges() {
		double fuelPricePlusExtraCharges;


/*if(noOfPassengers>totalSeats)
{
	double chargesForSeat=((noOfPassengers-totalSeats)* ExtraCharges.PERHEAD.getCharge());
	 fuelPricePlusExtraCharges = ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge()+ chargesForSeat;

}else{}*/

		 fuelPricePlusExtraCharges = ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge();

return fuelPricePlusExtraCharges;
		
	}
	
}