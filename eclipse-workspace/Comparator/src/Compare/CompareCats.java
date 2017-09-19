package Compare;

import java.util.ArrayList;
import java.util.Collections;

public class CompareCats {

	public static void main(String[] args) 
	{
		
		ArrayList<Cat> list= new ArrayList<Cat>();
		
		list.add(new Cat("Tom", 5));
		list.add(new Cat("bane", 10));
		list.add(new Cat("meme", 7));
		list.add(new Cat("kate", 2));
		
		Collections.sort(list, Cat.nameComparator);
		
		for(Cat c: list)
		{
			System.out.println(c.getName());
		}
		
		Collections.sort(list, Cat.ageCompare );
		
		for(Cat c: list)
		{
			System.out.println(c.getName()+ "  :  " +c.getAge());
		}
	}

}
