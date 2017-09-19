import java.util.HashMap;

public class Example 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(100, "My name is Anu Nair");
		map.put(101, "630764");
		map.put(102,"From Gwalior");
		System.out.println("The data before removal is" + map);
		
		map.remove(102);
		System.out.println("The data after removal is" + map);
	}

}
