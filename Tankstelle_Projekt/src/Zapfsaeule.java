
public class Zapfsaeule {
	private int mNummer;
	private String mStatus;
	private String mModus;
	
	public Zapfsaeule(String pModus)
	{
		mModus = pModus;
		mStatus = "Benutzbar";
	}

	public void setmModus(String pModus) {
		mModus = pModus;
	}

	public String getmModus() {
		return mModus;
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
}
