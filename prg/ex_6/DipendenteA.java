package prg.ex_6;
import prg.ex_5.Dipendente;

public class DipendenteA extends Dipendente
{
	private int malattia;


	//constructor method
	public DipendenteA(String matricola, double stipendio, double straordinario)
	{
		super(matricola,stipendio,straordinario);
		malattia = 0;
	}


	public void prendiMalattia(int nGiorni)
	{
		if(nGiorni > 0)
		{
			malattia += nGiorni;
		}
	}

	@Override
	public double paga(int nOre)
	{
		double p = super.paga(nOre);

		if(malattia == 0)
		{
			return p;
		}
		return p-(malattia*15.0);
	}

	public void stampaMalattia()
	{
		System.out.println("Giorni di malattia presi: " + malattia);
	}
}