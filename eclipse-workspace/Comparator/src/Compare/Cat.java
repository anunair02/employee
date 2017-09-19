package Compare;

import java.util.Comparator;

public class Cat {
	String name;
	int age;


public int getAge()
{
	return age;
}
public void setAge(int age)
{
this.age=age;	
}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age= age;
	}

public static Comparator<Cat> nameComparator= new Comparator<Cat>()
{
	public int compare(Cat c1, Cat c2)
	{
		String catName1=c1.getName().toLowerCase();
		String catName2=c2.getName().toLowerCase();
		
		return catName1.compareTo(catName2);
	}

};

public static Comparator<Cat> ageCompare= new Comparator<Cat>()
{
	public int compare(Cat c1, Cat c2) {
		int cat1Age=c1.getAge();
		int cat2Age=c2.getAge();
		return cat1Age-cat2Age;
	}
	};



}