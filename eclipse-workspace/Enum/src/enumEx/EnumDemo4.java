package enumEx;
enum Distance{
	PUNE(0.0),
	MUMBAI(123.56),
	GWALIOR(526.02),
	KERALA(5455.23);
	
	private final double dist;
	
	
	Distance(double d)
	{
		
		dist=d;
	}
	double getDistance()
	{
		return dist;
	}
	
}
public class EnumDemo4 {

	public static void main(String[] args) {
		for(Distance d: Distance.values())
		{
			System.out.println(d.getDistance());
			
		}

	}

	

}
