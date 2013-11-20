import java.util.List;


public class Zapfsaeule {
	private int mNummer;
	private String mStatus;
	private List<Zapfhahn> mZapfhahn;
	
	public Zapfsaeule(String pStatus)
	{
		mStatus = pStatus;
		mStatus = "Benutzbar";
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
