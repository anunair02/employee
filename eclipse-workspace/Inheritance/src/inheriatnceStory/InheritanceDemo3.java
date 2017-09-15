package inheriatnceStory;

class Cage{
	boolean cageBird=false;
	
}
class Bird extends Cage
{
String birdName;

	public Bird(String name) {
		this.birdName=name;
	}
	public Bird getName()
	{
		return getName();
	}
	boolean Empty=false;
	
	void notEmpty() 
	{
		System.out.println("the cage is empty");
	}
	void space() {
		System.out.println("the cage is not empty");
	}
	
}
class Animal extends Cage{
	String animalName;
	public Animal(String name) {
		this.animalName=name;
	}
boolean emptyCage=true;
	void empty()
	{
		System.out.println("animal cage is empty");
	}
}

public class InheritanceDemo3 {

	public static void main(String[] args) {
		Bird bird=new Bird("Sparrow");
		Animal animal=new Animal("lion");
		
			if(bird.cageBird) 
			{
				if(bird.Empty)
				{bird.notEmpty();}
				else
				{bird.space();}
			}else if(animal.emptyCage)
			{
				animal.empty();
			}
	}

}
