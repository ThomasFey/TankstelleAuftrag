import java.util.List;

public class AnzeigeSchild {
	
	public void displayInfo (List<Treibstoff> pTreibstoff)
	{
		for(Treibstoff einTreibstoff : pTreibstoff)
		{
			System.out.println(einTreibstoff.getBezeichnung() +  "Preis pro Liter" + einTreibstoff.getPreis)
		}
	}
}
