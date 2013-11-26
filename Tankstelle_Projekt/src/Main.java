import java.util.ArrayList;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tankstelle Programm");
		Tankstelle t = new Tankstelle();
		
		Treibstoff Bleifrei95 = new Treibstoff ( 1.7, "Super Bleifrei 95", 400);
		Treibstoff Bleifrei98 = new Treibstoff ( 1.9, "Super Bleifrei 98", 450);
		Treibstoff diesel = new Treibstoff ( 1.8, "Diesel", 425);
		Treibstoff superDiesel = new Treibstoff ( 1.65, "Super Diesel", 475);
		
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
		String eingabe = "";
		while (eingabe != "Quit")
		{
			eingabe = console.readLine();
			switch (eingabe) {
	            case Tanken:
	            	System.out.println("An welche Zapfsaeule möchten sie tanken?");
	            	int zapfhahnIndex = Integer.parseInt(console.readLine());
	            	System.out.println("Wie viel möchten sie tanken?");
	            	String anzahlLiter = console.readLine();
	            	System.out.println("Was  möchten sie tanken?");
	            	String treibstoffBez = console.readLine();
	            	//Tanken
	                     break;
	            case Bezahlen:
	            	System.out.println("Für welche Zapfsaeule möchten sie zahlen?");
	            	int zapfhahnIndex = Integer.parseInt(console.readLine());
	            	//Bezahlen
	                     break;
	            case Auswertung:
	            	System.out.println("Welchen Treibstoff möchten sie auswerten?");
	            	String treibstoffBez = console.readLine();
	            	//Auswerten
	                break;
	            default: 
	            	System.out.println("Ungültiger Befehl");
	                break;
			}
			System.out.println("Was möchten sie machen?");	
		}
		
	}

}
