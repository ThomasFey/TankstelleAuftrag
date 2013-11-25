import java.util.List;


public class Zapfsaeule {
	private int mNummer;
	private String mStatus;
	private List<Zapfhahn> mZapfhahn;
	
	public Zapfsaeule(String pArt)
	{
		mStatus = "Benutzbar";
		if(pArt = "Auto")
		{
			for(i = 1; i <= 4;i++)
			{
				Zapfhahn einZapfhahn = new Zapfhahn(Tankstelle.getTreibstoffeById(i),i,this);
				
			}
		}
		else
		{
			for(i = 1; i <= 2;i++)
			{
				Zapfhahn einZapfhahn = new Zapfhahn(Tankstelle.getTreibstoffeById(i),i,this);
				
			}
		}
		
	}

	public void setmStatus(String pStatus) {
		mStatus = pStatus;
	}

	public String getmStatus() {
		return mStatus;
	}

	public int getmNummer() {
		return mNummer;
	}
	
	public List<Zapfhahn> getmZapfhahn() {
		return mZapfhahn;
	}
}
