import java.util.List;


public class Zapfhahn {
	private int mNummer;
	private Treibstoff mTreibstoffe;
	
	public Zapfhahn (Treibstoff pTreibstoffe, int pNummer)
	{
		mTreibstoffe = pTreibstoffe;
		mNummer = pNummer;
	}

	public int getmNummer() {
		return mNummer;
	}
	
	public Treibstoff getmTreibstoffe() {
		return mTreibstoffe;
	}
}
