import java.util.List;

public class Tankstelle {
	private String mStandort;
	private List<Treibstoff> mTreibstoffe;
	private List<Tankauftrag> mTankauftraege;
	
	public Tankstelle()
	{
		mTreibstoffe = new Arraylist<Treibstoff>();
		mTankauftraege = new Arraylist<Tankauftrag>()
	}
	public void addTankauftrag(Tankauftrag pTankauftrag)
	{
		mTankauftraege.Add(pTankauftrag);
	}
	public List<Tankauftrag> getTankauftrag()
	{
		return mTreibstoffe;
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
