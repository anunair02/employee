package inheriatnceStory;

class Mammal
{
	String name="Dolphin";
	int ageOfMother=5;
	void eat() 
	{
		System.out.println("the mammal survives in ocean");
	}
}
	class Dolphin extends Mammal
	{
		String oceanName="Pacific";
		void swim() 
		{
			System.out.println("The dolphin swims");
		}
	}
	
	class Babies extends Dolphin
	{
	int ageOfBaby=1;
		void birth() {
			System.out.println("baby is just born");
		}
	}

public class InheritanceDemo2 {

	public static void main(String[] args) {
		Babies baby=new Babies();
		System.out.println(" Mammal Name : "+ baby.name+ " \nOcean Name : "+ baby.oceanName+ " \nAge of Mother : "+ baby.ageOfMother+ " \nAge of Baby : "+ baby.ageOfBaby);
		baby.eat();
		baby.swim();
		baby.birth();
	}

}
