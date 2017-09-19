package factoryStory;

public class BankFactory extends AbstractBankFactory{

	@Override
	public Bank getBank(String name) {
		if(name==null) 
		{
		return null;
		}
		 if(name.equalsIgnoreCase("icici bank"))
		{
			return new ICICIBank();
		}
		else if(name.equalsIgnoreCase("hdfc bank"))
		{
			return new HDFCBank();
		}
		else if(name.equalsIgnoreCase("canara bank"))
		{
			return new CanaraBank();
		}
		 return null;
		
	}

}
