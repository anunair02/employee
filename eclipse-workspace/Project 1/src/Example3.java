import java.util.HashMap;
import java.util.Scanner;

public class Example3 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, Car> map=new HashMap<Integer, Car>();
		System.out.println("Enter the number of Entries");
		Scanner wen=new Scanner(System.in);
		
		int n=wen.nextInt();
		Car c1=new Car("Honda", "Sinha", "Diesal",100001);
		Car c2=new Car("Etios", "Agrawal", "Petrol", 2000002);
		
		map.put(1, c1);
		map.put(2,c2);
		
		for(HashMap.Entry<Integer, Car> entry:map.entrySet())
		{
			int key=entry.getKey();
			Car c= entry.getValue();
			System.out.println(key+ " " + c.name + " " + c.owner + " " + c.carType);
			
     

	}

}
}
