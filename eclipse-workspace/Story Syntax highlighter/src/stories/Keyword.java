package stories;

public class Keyword {
	
	
	private String key;
	private String color;
	private String font;
	private String changeCase;
	
	public Keyword(String key, String color, String font, String changeCase) 
	{
		this.key = key;
		this.color = color;
		this.font = font;
		this.changeCase = changeCase;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFont() {
		return font;
	}
	public void setFont(String font) {
		this.font = font;
	}
	public String getchangeCase() {
		return changeCase;
	}
	public void setchangeCase(String changeCase) {
		this.changeCase = changeCase;
	}

}

