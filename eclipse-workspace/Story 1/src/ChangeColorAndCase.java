import java.util.HashMap;

public class ColorNChangeCase 
{
	public static String changeKeywordCase (String sentence, String keywordAs, String keywordAnd, HashMap<String, Font> keywordColorMap)
	 {
		
		
		for(HashMap.Entry<String, Font> entry:keywordColorMap.entrySet())
		
			{
			
				String key=entry.getKey();
				Font style=entry.getValue();
				
				sentence=sentence.replaceAll(key, style.color+ style.addSpace+ key+ style.addSpace+ style.color);
				
				if(key==keywordAs|| key==keywordAnd)
				{
					sentence=sentence.replaceAll(key, key.toUpperCase());
				}
				else
				{
					sentence=sentence.replaceAll(key,key.toLowerCase());
				}
			}
		return sentence;
	
}
}
