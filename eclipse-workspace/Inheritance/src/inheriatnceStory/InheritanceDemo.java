package inheriatnceStory;

class animal{
	void eat() {
		System.out.println("the animal eats");
	}
}
	class Lion extends animal{
		void roar() {
			System.out.println("The lion roars");
		}
	}

public class InheritanceDemo {

	public static void main(String[] args) {
		Lion lion=new Lion();
		lion.eat();
		lion.roar();

	}

}
