package factoryStory;

public class HDFCBank implements Bank{
	private String BNAME;
	public HDFCBank()
{
		BNAME="HDFC Bank";	
}
	@Override
	public String getBankName() {
		
		return BNAME;
	}

}
