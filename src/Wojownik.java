public class Wojownik extends Postac{

	public Wojownik() {
		super(predkoscAtaku - 100);
	}

	public void atak (double predkoscAtaku, double atak, double kryt, double sila){
		this.predkoscAtaku = predkoscAtaku;
		this.atak = atak;
		this.kryt = kryt;
		this.sila = sila;
		double damage = predkoscAtaku + atak + kryt + sila;
		System.out.println("Zadajesz: " + damage + " obrazen");}


	}
}
