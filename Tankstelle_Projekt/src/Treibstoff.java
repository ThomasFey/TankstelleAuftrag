
public class Treibstoff {
	private String Bezeichnung;
	private double PreisProLiter;
	
	public Treibstoff (double pPreisProLiter, String pBezeichnung)
	{
		
	}

	public void setPreisProLiter(double pPreisProLiter) {
		PreisProLiter = pPreisProLiter;
	}

	public double getPreisProLiter() {
		return PreisProLiter;
	}

	public void setBezeichnung(String pBezeichnung) {
		Bezeichnung = pBezeichnung;
	}

	public String getBezeichnung() {
		return Bezeichnung;
	}
}
