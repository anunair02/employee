package carRenatl;

public class CarRental {

	public static void main(String[] args) {
	VehicleFactory vehicleFactory=new VehicleFactory();
	Vehicle bus=vehicleFactory.getVehicle("bus");
	Trip trip1=new Trip("MUMBAI","BANGALORE");
	System.out.println(bus.vehicleName+" "+bus.feature+ " "+bus.fuelType+ " "+trip1.fromCity+"-"+trip1.toCity);
	System.out.println("Total Expense: "+RentCalculator.rent(trip1, bus) );

	
	Vehicle car=vehicleFactory.getVehicle("Car");
	Trip trip2=new Trip("PUNE","MUMBAI");
	System.out.println(car.vehicleName+" "+car.feature+ " " +trip2.fromCity+ "-"+trip2.toCity);
	System.out.println("Total Expense: "+RentCalculator.rent(trip2, car));
	
	
	Vehicle suv=vehicleFactory.getVehicle("SUV");
	Trip trip3=new Trip("MUMBAI","BANGALORE");
	System.out.println(suv.vehicleName+" "+suv.feature+" "+trip3.fromCity+ "-"+trip3.toCity);
	System.out.println("Total Expense: "+RentCalculator.rent(trip3, suv));
	}

}
