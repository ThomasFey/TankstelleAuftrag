import java.util.List;

public class AnzeigeSchild {
	
	public void displayInfo (List<Treibstoff> pTreibstoff)
	{
		for(Treibstoff einTreibstoff : pTreibstoff)
		{
			System.out.println(einTreibstoff.getmBezeichnung() +  "Preis pro Liter" + einTreibstoff.getmPreisProLiter())
		}
	}
}
