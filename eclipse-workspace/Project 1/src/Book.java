import java.util.*;

public class Book {
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	int id;
	String name,author,publisher;
	int quantity;
	

}
/*
 * { int flag=0; String blue="[blue]"; ArrayList<String> array=new
 * ArrayList<String>();
 * 
 * for(int i=0;i<word.length;i++) { flag=0; String one=word[i];
 * 
 * for(int j=0;j<s.length;j++) { flag=flag+1; String two=s[j];
 * 
 * if(one.equalsIgnoreCase(two)) { array.add(blue); array.add(two);
 * array.add(blue);
 * 
 * break; } else if(flag==s.length) { flag=0; array.add(one);
 * 
 * } array.add(" "); }
 * 
 * } return array; for(String a: array) { System.out.print(a); }
 */