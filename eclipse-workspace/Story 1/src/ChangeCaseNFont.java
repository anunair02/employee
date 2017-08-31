import java.util.HashMap;

public class ChangeCaseNFont 
{
		public static String changeKeywordCaseNFont(String sentence, String keywordAs, String keywordAnd, HashMap<String, Font> keywordNColorMap)
		{
			
			for(HashMap.Entry<String, Font> entry:keywordNColorMap.entrySet())
			
				{
				
					String key=entry.getKey();
					Font style=entry.getValue();
					
					sentence=sentence.replaceAll(key, style.color+ style.font+ style.addSpace+ key+ style.addSpace+ style.font+ style.color);
					if(key==keywordAs || key==keywordAnd)
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
