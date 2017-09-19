package factoryStory;

public class CanaraBank implements Bank{
		private String BNAME;
		public CanaraBank()
		{
			BNAME="Canara Bank";
		}
	@Override
	public String getBankName() {
	
		return BNAME;
	}

}
