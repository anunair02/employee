import java.util.ArrayList;

public class SingleColor {

	static final String HIGHLIGHTER="[blue]";
	
	public static String highlightKeywords(String sentence, ArrayList<String> keywordList) {
		
		for (String word : keywordList) {
			sentence = sentence.replaceAll(word, HIGHLIGHTER+ word+ HIGHLIGHTER);
		}
		return sentence;
	}

}


