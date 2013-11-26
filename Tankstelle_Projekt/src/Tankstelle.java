import java.util.List;
import java.util.ArrayList;

public class Tankstelle {
	private String mStandort;
	private List<Treibstoff> mTreibstoffe;
	private List<Tankauftrag> mTankauftraege;
	private List<Zapfsaeule> mZapfsaeulen;
	
	public Tankstelle()
	{
		mTreibstoffe = new ArrayList<Treibstoff>();
		mTankauftraege = new ArrayList<Tankauftrag>();
		mZapfsaeulen = new ArrayList<Zapfsaeule>();
	}
	public void addTankauftrag(Tankauftrag pTankauftrag)
	{
		mTankauftraege.add(pTankauftrag);
	}
	public List<Tankauftrag> getTankauftrag()
	{
		return mTankauftraege;
	}
	public void addTreibstoff(Treibstoff pTreibstoff)
	{
		mTreibstoffe.add(pTreibstoff);
	}
	
	public void addZapfsaeule(Zapfsaeule pZapfsaeule)
	{
		mZapfsaeulen.add(pZapfsaeule);
	}
	
	public Treibstoff getTreibstoffeById(String pBezeichnung)
	{
		for(int i = 0; i <= 3; i++)
		{
			Treibstoff treibstoffe = mTreibstoffe.get(i);
			if(treibstoffe.getmBezeichnung() == pBezeichnung)
			{
				return treibstoffe;
			}
		}
		
		return null;
	}

	public void setmStandort(String pStandort) {
		this.mStandort = pStandort;
	}

	public String getmStandort() {
		return mStandort;
	}
}
