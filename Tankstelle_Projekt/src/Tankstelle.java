import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

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
	//F�gt einen Auftrag zu die Auftr�geliste
	public void addTankauftrag(Tankauftrag pTankauftrag)
	{
		mTankauftraege.add(pTankauftrag);
	}
	public List<Kasse> getKassen()
	{
		return mKassen;
	}
	//F�gt eine Kasse zur Tankstelle hinzu
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
	//F�gt die Treibstoffe zur Tankstelle hinzu
	public void addTreibstoff(Treibstoff pTreibstoff)
	{
		mTreibstoffe.add(pTreibstoff);
	}
	//F�gt eine Zapfs�ule zur Tankstelle
	public void addZapfsaeule(Zapfsaeule pZapfsaeule)
	{
		mZapfsaeulen.add(pZapfsaeule);
	}
	//Auswertet der eingegebene Treibstoffbezeichnung
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
	//Auswertet die Auftr�ge in der eingegebene Jahr
	public void AuswertenByJahr(int pJahr)
	{
		int anzahlAuftraege = 0;
		double Umsatz = 0;
		for(int i = 0; i < mTankauftraege.size(); i++)
		{
			Tankauftrag einTankauftrag = mTankauftraege.get(i);
			if(einTankauftrag.getmDatum().get(Calendar.YEAR) == pJahr)
			{
				Umsatz =+ einTankauftrag.getmZahlung();
				anzahlAuftraege ++;
			}
		}
		System.out.println("Jahr: " + pJahr);
		System.out.println("Anzahl Aufträge: " + anzahlAuftraege);
		System.out.println("Umsatz: " + Umsatz + " Fr.");
	}
	//Auswertet die Auftr�ge in der eingegebene Monat
	public void AuswertenByMonat(int pMonat)
	{
		int anzahlAuftraege = 0;
		double Umsatz = 0;
		for(int i = 0; i < mTankauftraege.size(); i++)
		{
			Tankauftrag einTankauftrag = mTankauftraege.get(i);
			if(einTankauftrag.getmDatum().get(Calendar.MONTH) == (pMonat - 1))
			{
				Umsatz =+ einTankauftrag.getmZahlung();
				anzahlAuftraege ++;
			}
		}
		System.out.println("Monat: " + pMonat);
		System.out.println("Anzahl Aufträge: " + anzahlAuftraege);
		System.out.println("Umsatz: " + Umsatz + " Fr.");
	}
	//Auswertet die Auftr�ge in der eingegebene Tag
	public void AuswertenByTag(int pJahr,int pMonat,int pTag)
	{
		int anzahlAuftraege = 0;
		double Umsatz = 0;
		for(int i = 0; i < mTankauftraege.size(); i++)
		{
			Tankauftrag einTankauftrag = mTankauftraege.get(i);
			if(einTankauftrag.getmDatum().get(Calendar.YEAR) == pJahr)
			{
				if(einTankauftrag.getmDatum().get(Calendar.MONTH) == (pMonat - 1))
				{
					if(einTankauftrag.getmDatum().get(Calendar.DAY_OF_MONTH) == pTag)
					Umsatz =+ einTankauftrag.getmZahlung();
					anzahlAuftraege ++;
				}
			}
		}
		System.out.println("Tag: " + pJahr);
		System.out.println("Anzahl Aufträge: " + anzahlAuftraege);
		System.out.println("Umsatz: " + Umsatz + " Fr.");
	}
	//Auswerten eines Treibstoff mit der eingegebene Treibstoff Objekt
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
	//Gibt der Treibstoff mit der eingegebene Index
	public Treibstoff getTreibstoffeByIndex(int pIndex)
	{
		return  mTreibstoffe.get(pIndex);
	}
	//Gibt der Treibstoff mit der eingegebene Bezeichnung
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
	//Rundet ein eingegebenes Bertrag
	public double runden(double pPreis) {
		pPreis = Math.round(pPreis*20.0)/20.0;
		return pPreis;
		
	}
}
