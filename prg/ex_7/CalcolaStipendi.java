package prg.ex_7;
import prg.ex_5.Dipendente;
import prg.ex_6.DipendenteA;

public class CalcolaStipendi
{
	public static void main(String[] args) {
		Dipendente d = new Dipendente("00309",1000.0,7.5);

		System.out.println("Paga: " + d.paga(10));
		System.out.println("Stipendio: " + d.getStipendio());

		DipendenteA da = new DipendenteA("00201",1500.0,8.5);

		da.prendiMalattia(5);
		System.out.println("Paga: " + da.paga(3));
		da.stampaMalattia();

	}
}