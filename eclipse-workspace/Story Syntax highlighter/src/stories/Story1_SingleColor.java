package stories;
import java.util.Set;

public class Story1_SingleColor{

	//static final String HIGHLIGHTER="[blue]";
	
	
	 
	public static String highlightKeywords(String sentence, Set<Keyword> keywordSet) {
		
		for (Keyword word : keywordSet) {
			String key=word.getKey();
			word.setColor("[blue]");
			 sentence=sentence.replaceAll(key, word.getColor()+ key+ word.getColor());
		}
		return sentence;
	}

	

}


