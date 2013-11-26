import java.util.List;


public class Zapfsaeule {
	private int mNummer;
	private String mStatus;
	private List<Zapfhahn> mZapfhahn;
	
	public Zapfsaeule(List<Treibstoff> treibstoffe)
	{
		mStatus = "Benutzbar";
		
		for(int i = 0; i < treibstoffe.size(); i++)
		{
			Zapfhahn einZapfhahn = new Zapfhahn(treibstoffe.get(i),i,this);
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
