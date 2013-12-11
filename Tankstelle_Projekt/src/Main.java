import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Tankstelle Programm");
		Tankstelle t = new Tankstelle();
		Scanner in = new Scanner(System.in);
		
		//Erstellt alle Treibstoffe
		Treibstoff Bleifrei95 = new Treibstoff ( 1.81, "Super Bleifrei 95", 10000);
		Treibstoff Bleifrei98 = new Treibstoff ( 1.81, "Super Bleifrei 98", 10000);
		Treibstoff diesel = new Treibstoff ( 1.98, "Diesel", 10000);
		Treibstoff superDiesel = new Treibstoff ( 2.01, "Super Diesel", 20000);
		
		//Zuweist die Treibstoffe für Auto
		List<Treibstoff> autoTreibstoffe = new ArrayList<Treibstoff>();
		autoTreibstoffe.add(Bleifrei95);
		autoTreibstoffe.add(Bleifrei98);
		autoTreibstoffe.add(diesel);
		autoTreibstoffe.add(superDiesel);
		
		//Zuweist die Treibstoffe für Lastwagen
		List<Treibstoff> lastwagenTreibstoffe = new ArrayList<Treibstoff>();
		lastwagenTreibstoffe.add(diesel);
		lastwagenTreibstoffe.add(superDiesel);
		
		//Treibstoffe zu die Tankstelle angelegt
		t.addTreibstoff(diesel);
		t.addTreibstoff(superDiesel);
		t.addTreibstoff(Bleifrei95);
		t.addTreibstoff(Bleifrei98);
		
		//Ein Zapfsaeule für jede Fahrzeugetyp erstellt
		t.addZapfsaeule(new Zapfsaeule(autoTreibstoffe));
		t.addZapfsaeule(new Zapfsaeule(lastwagenTreibstoffe));
		
		//Ein Anzeigeschild erstellt
		AnzeigeSchild s = new AnzeigeSchild();
		
		s.displayInfo(autoTreibstoffe);
		int eingabe = 0;
		System.out.println("Was moechten sie machen?");
		System.out.println("1: Tanken");
		System.out.println("2: Zahlen");
		System.out.println("3: Treibstoff Information");
		System.out.println("4: Alle Preis anzeigen");
		while (eingabe != 5)
		{
			eingabe = Integer.parseInt(in.next());
			switch (eingabe) {
				//Tanken Vorgang
	            case 1:
	            	System.out.println("An welche Zapfsaeule moechten sie tanken?");
	            	int zapfsaeuleIndex = Integer.parseInt(in.next());
	            	System.out.println("Wie viel moechten sie tanken?");
	            	int anzahlLiter = Integer.parseInt(in.next());
	            	System.out.println("Was moechten sie tanken?");
	            	String treibstoffBez = in.next();
	            	double preis = t.getTreibstoffeByBezeichnung(treibstoffBez).getmPreisProLiter() * (double) anzahlLiter;
	            	System.out.println("Preis: " + preis);
	            	t.getTreibstoffeByBezeichnung(treibstoffBez).setmInhalt(t.getTreibstoffeByBezeichnung(treibstoffBez).getmKapatitaet() - anzahlLiter);
	            	System.out.println("Tankinhalt: " + t.getTreibstoffeByBezeichnung(treibstoffBez).getmInhalt());
	            	int index = 0;
	            	for(Zapfsaeule eineZapfsaeule : t.getZapfsaeulen())
	            	{
	            		if(zapfsaeuleIndex == index)
	            		{
	            			List<Zapfhahn> einZapfhahn = eineZapfsaeule.getmZapfhahn();
	            			
	            			for(int indexZapfhahn = einZapfhahn.size(); indexZapfhahn < 1; indexZapfhahn--)
	            			{
	            				if(einZapfhahn.get(indexZapfhahn).getmTreibstoffe().getmBezeichnung().compareTo(treibstoffBez) == 0)
	            				{
	            					einZapfhahn.get(indexZapfhahn).Tanken(t, anzahlLiter);
	            					System.out.println("Getankt");
	            				}
	            			}
	            		}
	            		index++;
	            	}
	                     break;
	            //Bezahlen Vorgang
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
                //Treibstoff auswerten Vorgang
	            case 3:
	            	System.out.println("Welchen Treibstoff moechten sie auswerten?");
	            	System.out.println("");
	            	String treibstoffBez1 = in.next();
	            	t.AuswertenByTreibstoff(treibstoffBez1);
	                break;
	            //Alle Treibstoffe mit PreisProLiter anzeigen
	            case 4:
	            	s.displayInfo(autoTreibstoffe);
	            //Exception Handling
	            default: 
	            	System.out.println("Ungueltiger Befehl");
	                break;
			}
			System.out.println("Was moechten sie machen?");	
		}
		
	}

}
