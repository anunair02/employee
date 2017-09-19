package enumEx;

enum Fruit
{
	Apple(5), 
	Banana(6),
	Grapes(8), 
	Orange(2), 
	;

private final int price;

Fruit(int p)
{
price=p;
}

int getPrice() {
    return price;
 }

}

public class EnumDemo3 
{
	public static void main(String[] args) {
		int total=0;
		for(Fruit s: Fruit.values())
		{
			System.out.println(s+ " : " +s.getPrice());
			total=total+s.getPrice();
			
			
		}
		System.out.println("Total price is : " + total);
	}

}
