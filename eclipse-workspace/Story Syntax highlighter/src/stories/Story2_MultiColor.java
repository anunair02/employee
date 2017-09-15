package stories;
import java.util.Set;

public class Story2_MultiColor 
{
 public static String highlightKeyword(String sentence, Set<Keyword> keywordSet)
 {
	 
	for(Keyword word: keywordSet)
	{
		String key=word.getKey();
		sentence=sentence.replaceAll(key, word.getColor()+ key+ word.getColor());
	}
	return sentence;
	 
 }


}



