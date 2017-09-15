    package lambdaStories;

import java.util.ArrayList;  
    import java.util.Collections;  
    import java.util.List;  
    
    
    class laptop{  
String  id;
String name;
double price;
public laptop(String id, String name, double price)
{
	this.id=id;
	this.name=name;
	this.price=price;
	}
}

    public class lambdaCollections{  
        public static void main(String[] args) {  
            List<laptop> list=new ArrayList<laptop>();  
              
          
            list.add(new laptop("1A","lenovo",554289.54));  
            list.add(new laptop("2A","HP",57645.254));  
            list.add(new laptop("3A","Hawaii", 554289.34));  
              
            System.out.println("Sorting on the basis of name...");  
      
         
            Collections.sort(list,(n1,n2)->{  
            return n1.name.compareTo(n2.name);  
            });  
            for(laptop n:list){  
                System.out.println(n.id+" "+n.name+" "+n.price);  
            }  
      System.out.println("Sorting on the basis of price");
      
      	Collections.sort(list,(p1,p2)->{
      		return (int) (p1.price-p2.price);
      	});
            for(laptop p: list)
            {
            	System.out.println(p.price+ " " + p.id+ " "+ p.name);
            }
        }  
    }  