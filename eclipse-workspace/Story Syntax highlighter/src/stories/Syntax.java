package stories;

import java.util.HashSet;
import java.util.Set;

public class Syntax
{
	
public static void main(String args[])
	{
		
		
		 //Keyword object is created to add different attributes
 		Keyword as=new Keyword("as","[blue]","", "upper");
 		Keyword If=new Keyword("if","[red]", "[bold]", "lower");
 		Keyword and=new Keyword("and","[red]","[bold]", "upper");
 		Keyword then=new Keyword("then","[green]","","lower");
 		Keyword when=new Keyword("when","[blue]","","lower");
		
		
		// keywordsSet
		
		Set<Keyword> keywordSet=new HashSet<Keyword>();
		keywordSet.add(as);
		keywordSet.add(If);
		keywordSet.add(and);
		keywordSet.add(then);
		keywordSet.add(when);
		
 
 						
		// Story 2 : For multiple color highlight
 		String sentence= "if we write a program and compile it, then as we run the program,we will get output \n";
		System.out.println("Story 2 : To highlight the keywords with multiple color\n");
		System.out.println(Story2_MultiColor.highlightKeyword(sentence, keywordSet));
		
		
		//Story 3 : To color highlight and change the case											
		System.out.println("Story 3 : To color and change the case of the keywords :\n");
		System.out.println(Story3_ChangeColorAndCase.changeKeywordCase(sentence, keywordSet));
		
		
		//Story 4 : To color highlight, change the case and format the keywords		
		System.out.println("Story 4 : To color and change the case of the keywords and change the font:\n");				
		System.out.println(Story4_ChangeColorCaseAndFont.changeKeywordCaseNFont(sentence,keywordSet));			
					
		
		//Input sentence for Story 1 
				String text= "if we write a program and compile it, then we can run the program to get output \n";
				//System.out.println("Input sentence for Story 1 and Story 2 : \n" + text);

		// Story 1 : For single color highlight	 		
		System.out.println("Story 1 : To highlight the given keywords with single color\n");		 		
 		System.out.println(Story1_SingleColor.highlightKeywords( text, keywordSet));
	}

	


}






