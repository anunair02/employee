package lambdaStories;

interface Addition{
	int add(int a,int b);
}
public class lambdaAddition {

	public static void main(String[] args) {
	try {	
		Addition add=(a,b)->
		{
			 return (a/b);
		};
		System.out.println(add.add(50, 50));
	}catch(ArithmeticException e) {System.out.println("Exception found");}

	}

}
