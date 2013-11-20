
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Tankauftrag {
	private int TreibstoffLiter;
	private double mZahlung;
	private String mStatus;
	private Date mDatum;
	
	public Tankauftrag(Zapfhahn pSaeule)
	{
		
	}
	public Date getmDatum() {
		return mDatum;
	}
	public void setmStatus(String pStatus) {
		this.mStatus = pStatus;
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
