import java.util.List;

public class Tankstelle {
	private String mStandort;
	private List<Treibstoff> mTreibstoffe;
	
	public Tankstelle()
	{
		mTreibstoffe = new Arraylist<Treibstoff>();
	}
	public void addTreibstoff(Treibstoff pTreibstoff)
	{
		mTreibstoffe.Add(pTreibstoff);
	}
	public Treibstoff getTreibstoffeById(int pId)
	{
		return mTreibstoffe.FindByIndex(pId);
	}

	public void setmStandort(String pStandort) {
		this.mStandort = pStandort;
	}

	public String getmStandort() {
		return mStandort;
	}
}
