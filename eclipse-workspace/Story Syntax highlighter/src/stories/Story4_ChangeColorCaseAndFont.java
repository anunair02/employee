package stories;
import java.util.HashMap;
import java.util.Set;

public class Story4_ChangeColorCaseAndFont 
{
		public static String changeKeywordCaseNFont(String sentence, Set<Keyword>keywordSet)
		{
			for(Keyword word: keywordSet)
			{
				String key=word.getKey();
				String changeCase=word.getchangeCase();
				String font=word.getFont();
				if(changeCase.equals("lower"))
				{
					sentence=sentence.replaceAll(key, word.getColor()+ word.getFont()+ key.toLowerCase()+ word.getFont()+ word.getColor());
				}
				else if(changeCase.equals("upper"))
				{
					sentence=sentence.replaceAll(key, word.getColor()+ word.getFont()+ key.toUpperCase()+ word.getFont()+ word.getColor());
				}
			}
		
			return sentence;
			
		}
}
