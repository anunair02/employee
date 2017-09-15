package stories;
import java.util.HashMap;
import java.util.Set;

public class Story3_ChangeColorAndCase 
{
	public static String changeKeywordCase (String sentence, Set<Keyword>keywordSet)
	 {
		for(Keyword word: keywordSet)
		{
			String key=word.getKey();
			String changeCase=word.getchangeCase();
			if(changeCase.equals("lower"))
			{
				sentence=sentence.replaceAll(key, word.getColor()+ key.toLowerCase()+ word.getColor());
			}
			else if(changeCase.equals("upper"))
			{
				sentence=sentence.replaceAll(key, word.getColor()+ key.toUpperCase()+ word.getColor());
			}
		}
		
		
		return sentence;
	
}
}
