import java.util.List;


public class Zapfhahn {
	private int mNummer;
	private Treibstoff mTreibstoffe;
	private Zapfsaeule mZapfsaeule;
	
	public Zapfhahn (Treibstoff pTreibstoffe, int pNummer, Zapfsaeule pZapfsaeule)
	{
		mTreibstoffe = pTreibstoffe;
		mNummer = pNummer;
		mZapfsaeule = pZapfsaeule;
	}

	public int getmNummer() {
		return mNummer;
	}
	public Zapfsaeule getmZapfsaeule() {
		return mZapfsaeule;
	}
	public Treibstoff getmTreibstoffe() {
		return mTreibstoffe;
	}
	public void Tanken(Tankstelle dieTankstelle, double pAnzahlLiter)
	{
		Tankauftrag einAuftrag = new Tankauftrag(this,pAnzahlLiter);
		dieTankstelle.addTankauftrag(einAuftrag);
	}
}
