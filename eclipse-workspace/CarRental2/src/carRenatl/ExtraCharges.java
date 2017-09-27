package carRenatl;

public enum ExtraCharges {
	PETROL(9), DIESEL(8), AC(2), DISCOUNT(.02), PERHEAD(1.5);

	private double charge;

	private ExtraCharges(double charge) {
		this.charge = charge;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

}
