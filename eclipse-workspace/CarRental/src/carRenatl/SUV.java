package carRenatl;

class SUV extends Vehicle{

	public SUV(String vehicleName) {
		super(vehicleName, "AC", "diesel");
		// TODO Auto-generated constructor stub
	}

	@Override
double getFuelPrice() {
		double fuelPrice=8+2;
		return fuelPrice;
	}

	
	
	
}