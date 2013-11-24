public class Kasse {
	private double mUmsatz;
	
	public Kasse ()
	{
		mUmsatz = 0;	
	}
	
	public void addTankauftrag (double pBetrag)
	{
		mUmsatz += pBetrag;
	}



	public double getmUmsatz() {
		return mUmsatz;
	}
}
