package factoryStory;

public class DisplayBank {

	public static void main(String[] args) {
		AbstractBankFactory bankFactory=FactoryCreator.getBank("Bank");
		String bankName="HDFC Bank";
			Bank b=bankFactory.getBank(bankName);
			System.out.println(b.getBankName());
	}

}
