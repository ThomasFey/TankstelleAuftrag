import java.util.Calendar;

public class Tankauftrag {
	private int TreibstoffLiter;
	private double mZahlung;
	private String mStatus;
	private Calendar mDatum;
	private Zapfhahn mZapfhahn;
	
	public Tankauftrag(Zapfhahn pHahn,int pTreibstoffLiter)
	{
		TreibstoffLiter = pTreibstoffLiter;
		mZapfhahn = pHahn;
		mDatum = Calendar.getInstance();
		mStatus = "Unbezahlt";
		mZahlung = (mZapfhahn.getmTreibstoffe().getmPreisProLiter() * TreibstoffLiter);
		mZapfhahn.getmZapfsaeule().setmStatus("Unbenutzbar");
	}
	public Calendar getmDatum() {
		return mDatum;
	}
	public void setmStatus(String pStatus) {
		this.mStatus = pStatus;
	}
	public Zapfhahn getmZapfhahn() {
		return mZapfhahn;
	}
	public String getmStatus() {
		return mStatus;
	}
	public double getmZahlung() {
		return mZahlung;
	}
	public int getTreibstoffLiter() {
		return TreibstoffLiter;
	}
	
}
