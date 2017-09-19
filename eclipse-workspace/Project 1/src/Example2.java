import java.util.HashMap;
public class Example2 {

	public static void main(String[] args) {
		
		HashMap<Integer,Book> map= new HashMap<Integer,Book>();
		Book b1=new Book(100,"Da Vinci Code","Dan Borwn","RHKD", 5);
		Book b2=new Book(101,"Let US C","Yashwantrao","DFGH", 8);
		Book b3=new Book(102,"Magic","Rhonda","SDFG",10);
		map.put(1, b1);
		map.put(2,b2);
		map.put(3, b3);
		System.out.println( "Details :");
		for(HashMap.Entry<Integer,Book> entry:map.entrySet())
		{
			int key=entry.getKey();
			Book b=entry.getValue();
			
			System.out.println( key+ +b.id+ " " +b.name+ " " +b.author + " " +b.publisher + " " +b.quantity);
		}
		
	}

}
