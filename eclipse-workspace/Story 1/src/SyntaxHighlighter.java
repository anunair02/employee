import java.util.*;
public class SyntaxHighlighter 
{
	public static void main(String args[]) 
	{
		
		//Input sentence for Story 1 and Story 2.
		String text= "if we write a program and compile it, then we can run the program to get output \n";
		System.out.println("Input sentence for Story 1 and Story 2 : \n" + text);
		
		
		
		// Story 1 : For single color highlight
				 		ArrayList<String> keywordList=new ArrayList<String>();
				 		keywordList.add("as");
				 		keywordList.add("if");
				 		keywordList.add("and");
				 		keywordList.add("then");
				 		keywordList.add("when");		 		
		System.out.println("Story 1 : To highlight the given keywords with single color\n");		 		
 		System.out.println(SingleColor.highlightKeywords(" The highlighted sentence is :\n " + text, keywordList));
 
 		
 		
 		 // Font object is created to add different attributes
				 		Font font1=new Font("[blue]", "", " ");
						Font font2=new Font("[red]", "[bold]", " ");
						Font font3=new Font("[red]", "[bold]", " ");
						Font font4=new Font("[green]","", " ");
						Font font5=new Font("[blue]", "", " ");
						
						
		// Story 2 : For multiple color highlight
				 		HashMap<String, Font> keywordColourMap= new HashMap<String, Font>();
				 		keywordColourMap.put("as",font1);
				 		keywordColourMap.put("if", font2);
				 		keywordColourMap.put("and", font3);
				 		keywordColourMap.put("then", font4);
				 		keywordColourMap.put("when",font5);	 		
		System.out.println("Story 2 : To highlight the keywords with multiple color\n");
		System.out.println(MultiColor.highlightKeyword("The highlighted sentence is : \n " + text, keywordColourMap));
		
		
		//Input sentence for Story 3 and Story 4.
		String sentence="IF we write a program and compile it, THEN as we run the program,we will get output \n";
		System.out.println("Input sentence for Story 3 and Story 4 : \n" + sentence);
		
		
		
		//Keywords to be converted into UpperCase
						String keywordAs="as";
						String keywordAnd="and";
						
						
		//Story 3 : To color highlight and change the case				
						HashMap<String, Font> keywordColorMap= new HashMap<String, Font>();
						keywordColorMap.put("as", font1);
						keywordColorMap.put("IF", font2);
						keywordColorMap.put("and", font3);
						keywordColorMap.put("THEN", font4);
						keywordColorMap.put("WHEN",font5);						
		System.out.println("Story 3 : To color and change the case of the keywords :\n");
		System.out.println(ColorNChangeCase.changeKeywordCase("The changed sentence is :\n" + sentence, keywordAs, keywordAnd, keywordColorMap));
		
		
 		
		//Story 4 : To color highlight, change the case and format the keywords	
						HashMap<String, Font> keywordNColorMap= new HashMap<String, Font>();
						keywordNColorMap.put("as", font1);
						keywordNColorMap.put("IF", font2);
						keywordNColorMap.put("and", font3);
						keywordNColorMap.put("THEN", font4);
						keywordNColorMap.put("WHEN", font5);
		
		System.out.println("Story 4 : To color and change the case of the keywords and change the font:\n");				
		System.out.println(ChangeCaseNFont.changeKeywordCaseNFont("The changed sentence is :\n" + sentence, keywordAs, keywordAnd, keywordNColorMap));			
						
						
	}
}
	









