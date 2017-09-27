package carRenatl;

class SUV extends Vehicle {

	public SUV(String vehicleName, int noOfPassengers) {
		super(vehicleName, "AC", "Diesel", noOfPassengers);

	}

	@Override
	double getCharges() {
		double fuelPricePlusExtraCharges;
double totalSeats=8;

if(this.noOfPassengers>totalSeats)
{
	double chargesForSeat=((this.noOfPassengers-totalSeats)* ExtraCharges.PERHEAD.getCharge());
	 fuelPricePlusExtraCharges = ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge()+ chargesForSeat;

}else
{
		 fuelPricePlusExtraCharges = ExtraCharges.DIESEL.getCharge() + ExtraCharges.AC.getCharge();
}
return fuelPricePlusExtraCharges;
		
	}
	
}