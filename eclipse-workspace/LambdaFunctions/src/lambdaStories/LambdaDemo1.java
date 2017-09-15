package lambdaStories;

interface Walking
{
public String walk(String place , String time);	
}
public class LambdaDemo1 {
public static void main(String[] args)
{
	Walking w=(place,time)->
	{
		return "I like walking to the " +place+" during " +time;
	};
	System.out.println(w.walk("park", "5-6 am"));
	
	
}
}
