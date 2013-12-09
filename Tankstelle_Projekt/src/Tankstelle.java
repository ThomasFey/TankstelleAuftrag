import java.util.List;
import java.util.ArrayList;

public class Tankstelle {
	private String mStandort;
	private List<Treibstoff> mTreibstoffe;
	private List<Tankauftrag> mTankauftraege;
	private List<Zapfsaeule> mZapfsaeulen;
	private List<Kasse> mKassen;
	private AnzeigeSchild mAnzeigeSchild;
	
	public Tankstelle()
	{
		mTreibstoffe = new ArrayList<Treibstoff>();
		mTankauftraege = new ArrayList<Tankauftrag>();
		mZapfsaeulen = new ArrayList<Zapfsaeule>();
		mAnzeigeSchild = new AnzeigeSchild();
		mKassen = new ArrayList<Kasse>();
	}
	public void addTankauftrag(Tankauftrag pTankauftrag)
	{
		mTankauftraege.add(pTankauftrag);
	}
	public List<Kasse> getKassen()
	{
		return mKassen;
	}
	public void addKasse(Kasse pKasse)
	{
		mKassen.add(pKasse);
	}
	public List<Tankauftrag> getTankauftrag()
	{
		return mTankauftraege;
	}
	public List<Zapfsaeule> getZapfsaeulen()
	{
		return mZapfsaeulen;
	}
	public void addTreibstoff(Treibstoff pTreibstoff)
	{
		mTreibstoffe.add(pTreibstoff);
	}
	
	public void addZapfsaeule(Zapfsaeule pZapfsaeule)
	{
		mZapfsaeulen.add(pZapfsaeule);
	}
	public void AuswertenByTreibstoff(String pTreibstoffbezeichnung)
	{
		Treibstoff einTreibstoff = getTreibstoffeByBezeichnung(pTreibstoffbezeichnung);
		int anzahlAuftraege = 0;
		double Umsatz = 0;
		for(int i = 0; i < mTankauftraege.size(); i++)
		{
			Tankauftrag einTankauftrag = mTankauftraege.get(i);
			if(einTreibstoff == einTankauftrag.getmZapfhahn().getmTreibstoffe())
			{
				Umsatz =+ einTankauftrag.getmZahlung();
				anzahlAuftraege ++;
			}
		}
		System.out.println("Treibstoff: " + einTreibstoff.getmBezeichnung());
		System.out.println("Anzahl Aufträge: " + anzahlAuftraege);
		System.out.println("Umsatz: " + Umsatz + " Fr.");
	}
	public void AuswertenByTreibstoff(Treibstoff pTreibstoff)
	{
		Treibstoff einTreibstoff = pTreibstoff;
		int anzahlAuftraege = 0;
		double Umsatz = 0;
		for(int i = 0; i < mTankauftraege.size(); i++)
		{
			Tankauftrag einTankauftrag = mTankauftraege.get(i);
			if(pTreibstoff == einTankauftrag.getmZapfhahn().getmTreibstoffe())
			{
				Umsatz =+ einTankauftrag.getmZahlung();
				anzahlAuftraege ++;
			}
		}
		System.out.println("Treibstoff: " + einTreibstoff.getmBezeichnung());
		System.out.println("Anzahl Aufträge: " + anzahlAuftraege);
		System.out.println("Umsatz: " + Umsatz + " Fr.");
	}
	
	public Treibstoff getTreibstoffeByIndex(int pIndex)
	{
		return  mTreibstoffe.get(pIndex);
	}
	public Treibstoff getTreibstoffeByBezeichnung(String pBezeichnung)
	{
		for(int i = 0; i < mTreibstoffe.size(); i++)
		{
			Treibstoff treibstoffe = mTreibstoffe.get(i);
			if(treibstoffe.getmBezeichnung().compareTo(pBezeichnung) == 0)
			{
				return treibstoffe;
			}
		}
		
		return null;
	}
	public void setmAnzeigeSchild(AnzeigeSchild pAnzeigeSchild) {
		this.mAnzeigeSchild = pAnzeigeSchild;
	}

	public AnzeigeSchild getmAnzeigeSchild() {
		return mAnzeigeSchild;
	}

	public void setmStandort(String pStandort) {
		this.mStandort = pStandort;
	}

	public String getmStandort() {
		return mStandort;
	}
	public double runden(double pPreis) {
		pPreis = Math.round(pPreis*20.0)/20.0;
		return pPreis;
		
	}
}
