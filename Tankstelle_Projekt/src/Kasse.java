public class Kasse {
	private double mUmsatz;
	
	public Kasse ()
	{
		mUmsatz = 0;	
	}
	
	//Bezahlt ein Auftrag und gibt die Zapfsaeule frei
	public void bezahleTankauftrag (Tankauftrag pAuftrag)
	{
		mUmsatz =+ pAuftrag.getmZahlung();
		pAuftrag.setmStatus("Bezahlt");
		Zapfsaeule eineSaeule = pAuftrag.getmZapfhahn().getmZapfsaeule();
		eineSaeule.setmStatus("Benutzbar");
	}



	public double getmUmsatz() {
		return mUmsatz;
	}
}
