package factoryStory;

public class FactoryCreator {
public static AbstractBankFactory getBank(String name) {
	if(name.equalsIgnoreCase("bank"))
	return new BankFactory();

return null;
}
}