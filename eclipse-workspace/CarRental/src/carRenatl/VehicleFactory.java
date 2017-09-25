package carRenatl;

public class VehicleFactory {

	public Vehicle getVehicle(String vehicleType)
	{
		if(vehicleType.equalsIgnoreCase("bus"))
		{
			return(new Bus("Tata Skyline","AC"));
		}
		else if(vehicleType.equalsIgnoreCase("car"))
		{
			return(new Car("Swift","Non-AC","diesel"));
		}
		else
			return(new SUV("Mahindra XUV 500"));
	
		
	}
}
