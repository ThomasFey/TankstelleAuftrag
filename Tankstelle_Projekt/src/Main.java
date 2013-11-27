import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tankstelle Programm");
		Tankstelle t = new Tankstelle();
		Scanner in = new Scanner(System.in);
		
		Treibstoff Bleifrei95 = new Treibstoff ( 1.7, " Super Bleifrei 95 ", 400);
		Treibstoff Bleifrei98 = new Treibstoff ( 1.9, " Super Bleifrei 98 ", 450);
		Treibstoff diesel = new Treibstoff ( 1.8, " Diesel ", 425);
		Treibstoff superDiesel = new Treibstoff ( 1.65, " Super Diesel ", 475);
		
		List<Treibstoff> autoTreibstoffe = new ArrayList<Treibstoff>();
		autoTreibstoffe.add(Bleifrei95);
		autoTreibstoffe.add(Bleifrei98);
		autoTreibstoffe.add(diesel);
		autoTreibstoffe.add(superDiesel);
		
		List<Treibstoff> lastwagenTreibstoffe = new ArrayList<Treibstoff>();
		lastwagenTreibstoffe.add(diesel);
		lastwagenTreibstoffe.add(superDiesel);
		
		t.addTreibstoff(diesel);
		t.addTreibstoff(superDiesel);
		t.addTreibstoff(Bleifrei95);
		t.addTreibstoff(Bleifrei98);
		
		
		t.addZapfsaeule(new Zapfsaeule(autoTreibstoffe));
		t.addZapfsaeule(new Zapfsaeule(lastwagenTreibstoffe));
		
		AnzeigeSchild s = new AnzeigeSchild();
		
		s.displayInfo(autoTreibstoffe);
		int eingabe = 0;
		System.out.println("Was moechten sie machen?");
		while (eingabe != 5)
		{
			eingabe = Integer.parseInt(in.next());
			switch (eingabe) {
	            case 1:
	            	System.out.println("An welche Zapfsaeule moechten sie tanken?");
	            	System.out.println("");
	            	int zapfsaeuleIndex = Integer.parseInt(in.next());
	            	System.out.println("Wie viel moechten sie tanken?");
	            	System.out.println("");
	            	int anzahlLiter = Integer.parseInt(in.next());
	            	System.out.println("Was moechten sie tanken?");
	            	System.out.println("");
	            	String treibstoffBez = in.next();
	            	int index = 0;
	            	for(Zapfsaeule eineZapfsaeule : t.getZapfsaeulen())
	            	{
	            		if(zapfsaeuleIndex == index)
	            		{
	            			for(Zapfhahn einZapfhahn : eineZapfsaeule.getmZapfhahn())
	            			{
	            				if(einZapfhahn.getmTreibstoffe().getmBezeichnung().compareTo(treibstoffBez) == 0)
	            				{
	            					einZapfhahn.Tanken(t, anzahlLiter);
	            					System.out.println("Getankt");
	            				}
	            			}
	            		}
	            		index++;
	            	}
	                     break;
	            case 2:
	            	System.out.println("Fuer welche Zapfsaeule moechten sie zahlen?");
	            	System.out.println("");
	            	int zapfsaeuleIndex1 = Integer.parseInt(in.next());
	            	int index1 = 0;
	            	for(Zapfsaeule eineZapfsaeule : t.getZapfsaeulen())
	            	{
	            		if(zapfsaeuleIndex1 == index1)
	            		{
	            			for(Tankauftrag einAuftrag : t.getTankauftrag())
	            			{
	            				if(eineZapfsaeule == einAuftrag.getmZapfhahn().getmZapfsaeule())
	            				{
	            					if(einAuftrag.getmStatus() == "Unbezahlt")
	            					{
	            						einAuftrag.setmStatus("Bezahlt");
	            						System.out.println("Bezahlt: " + einAuftrag.getmZahlung());
	            					}
	            				}
	            			}
	            		}
	            		index1++;
	            	}
	                     break;
	            case 3:
	            	System.out.println("Welchen Treibstoff moechten sie auswerten?");
	            	System.out.println("");
	            	String treibstoffBez1 = in.next();
	            	t.AuswertenByTreibstoff(treibstoffBez1);
	                break;
	            case 4:
	            	s.displayInfo(autoTreibstoffe);
	            default: 
	            	System.out.println("Ungueltiger Befehl");
	                break;
			}
			System.out.println("Was moechten sie machen?");	
		}
		
	}

}
