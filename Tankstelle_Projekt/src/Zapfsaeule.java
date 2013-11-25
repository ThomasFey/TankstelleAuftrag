import java.util.List;


public class Zapfsaeule {
	private int mNummer;
	private String mStatus;
	private List<Zapfhahn> mZapfhahn;
	
	public Zapfsaeule(String pArt,Tankstelle pTankstelle)
	{
		mStatus = "Benutzbar";
		if(pArt == "Auto")
		{
			for(int i = 1; i <= 4;i++)
			{
				Zapfhahn einZapfhahn = new Zapfhahn(pTankstelle.getTreibstoffeById((i - 1)),i,this);
				
			}
		}
		else
		{
			for(int i = 1; i <= 2;i++)
			{
				Zapfhahn einZapfhahn = new Zapfhahn(pTankstelle.getTreibstoffeById((i - 1)),i,this);
				
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
