package factoryStory;

public class ICICIBank implements Bank{
	
	private String BNAME;
	public ICICIBank()
	{
		BNAME="ICICI Bank";
	}

	@Override
	public String getBankName() {
		
		return BNAME;
	}

}
