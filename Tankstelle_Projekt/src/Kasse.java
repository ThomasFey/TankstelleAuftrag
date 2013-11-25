public class Kasse {
	private double mUmsatz;
	
	public Kasse ()
	{
		mUmsatz = 0;	
	}
	
	public void bezahleTankauftrag (Tankauftrag pAuftrag)
	{
		mUmsatz =+ pAuftrag.mZahlung;
		pAuftrag.setmStatus("Bezahlt");
		Zapfsaeule eineSaeule = pAuftrag.getmZapfhahn().getmZapfsaeule();
		eineSaeule.setmStatus("Benutzbar");
	}



	public double getmUmsatz() {
		return mUmsatz;
	}
}
