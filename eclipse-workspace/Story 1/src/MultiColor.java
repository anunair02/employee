import java.util.HashMap;

public class MultiColor 
{
 public static String highlightKeyword(String sentence, HashMap<String, Font> keywordColourMap)
 {
	
	 for(HashMap.Entry<String, Font> entry:keywordColourMap.entrySet())
		{
			String key=entry.getKey();
			Font style=entry.getValue();
			
			sentence=sentence.replaceAll(key, style.color+ style.addSpace+ key+ style.addSpace+ style.color);
			
		}
	return sentence;
	 
 }
}
