package lab2BsamochodyMatusiakPawel;

public class Samochod {
	int moc;
	double cena;
	String kolor;

	public Samochod(int moc, double cena, String kolor){
			this.moc = moc;
			this.cena = cena;
			this.kolor = kolor;
	}
	public double kosztUtrzymania(double koszt){
		return koszt*12;
	}
	public double zuzyciePaliwa(double zuzyciePaliwa){
		return zuzyciePaliwa;
	}
}