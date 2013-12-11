import java.util.List;

public class AnzeigeSchild {
	
	//Gibt alle Treibstoffe und Preis pro Liter aus
	public void displayInfo (List<Treibstoff> pTreibstoff)
	{
		for(Treibstoff einTreibstoff : pTreibstoff)
		{
			System.out.println(einTreibstoff.getmBezeichnung() +  "  Preis pro Liter: " + einTreibstoff.getmPreisProLiter());
		}
	}
}
