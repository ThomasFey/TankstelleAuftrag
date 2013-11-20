
public class Tank {
	private int mInhalt;
	private int mKapazitaet;
	
	public Tank (Treibstoff pTreibstoff)
	{
		
	}
	
	public void takeInhalt (int pMenge)
	{
		
	}
	
	public int getLeerPlatz()
	{
		int leerPlatz = getmKapazitaet() - getmInhalt();
		return leerPlatz;
	}

	public int getmKapazitaet() {
		return mKapazitaet;
	}

	public int getmInhalt() {
		return mInhalt;
	}
}
