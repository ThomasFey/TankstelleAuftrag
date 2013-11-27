public class Treibstoff {
	private String mBezeichnung;
	private double mPreisProLiter;
	private int mKapazitaet;
	private double mInhalt;
	
	public Treibstoff (double pPreisProLiter, String pBezeichnung, int pKapazitaet)
	{
		mInhalt = pKapazitaet;
		mBezeichnung = pBezeichnung;
		mKapazitaet = pKapazitaet;
		mPreisProLiter = pPreisProLiter;
	}
	
	public void setmPreisProLiter(double pPreisProLiter) {
		mPreisProLiter = pPreisProLiter;
	}

	public double getmPreisProLiter() {
		return mPreisProLiter;
	}

	public void setmBezeichnung(String pBezeichnung) {
		mBezeichnung = pBezeichnung;
	}

	public String getmBezeichnung() {
		return mBezeichnung;
	}
	
	public int getmKapatitaet() {
		return mKapazitaet;
	}
	
	public void setmKapazitaet(int pKapazitaet) {
		mKapazitaet = pKapazitaet;
	}
	
	public double getmInhalt() {
		return mInhalt;
	}
	
	public void setmInhalt(int pInhalt)
	{
		mInhalt = pInhalt;
	}
}
