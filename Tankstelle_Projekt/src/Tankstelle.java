import java.util.List;
import java.util.ArrayList;
import java.util.Date;

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
	public void addTreibstoff(Treibstoff pTreibstoff)
	{
		mTreibstoffe.add(pTreibstoff);
	}
	
	public void addZapfsaeule(Zapfsaeule pZapfsaeule)
	{
		mZapfsaeulen.add(pZapfsaeule);
	}
	public void AuswertenByTreibstoff(string pTreibstoffbezeichnung)
	{
		Treibstoff = getTreibstoffeByBezeichnung(string pTreibstoffbezeichnung)
		int anzahlAuftraege = 0;
		double Umsatz = 0;
		for(int i = 0; i < mTankauftraege.size(); i++)
		{
			Tankauftrag einTankauftrag = mTankauftraege.get(i);
			if(Treibstoff == einTankauftrag.getmZapfhahn().getmTreibstoffe())
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
		Treibstoff = pTreibstoff;
		int anzahlAuftraege = 0;
		double Umsatz = 0;
		for(int i = 0; i < mTankauftraege.size(); i++)
		{
			Tankauftrag einTankauftrag = mTankauftraege.get(i);
			if(Treibstoff == einTankauftrag.getmZapfhahn().getmTreibstoffe())
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
		return  mTreibstoffe.get(i);
	}
	public Treibstoff getTreibstoffeByBezeichnung(String pBezeichnung)
	{
		for(int i = 0; i <= 3; i++)
		{
			Treibstoff treibstoffe = mTreibstoffe.get(i);
			if(treibstoffe.getmBezeichnung() == pBezeichnung)
			{
				return treibstoffe;
			}
		}
		
		return null;
	}
	public void setmAnzeigeSchild(AnzeigeSchild pStandort) {
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
}
