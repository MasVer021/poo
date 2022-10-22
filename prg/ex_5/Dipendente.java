package prg.ex_5;


public class Dipendente
{
	protected String matricola;
	protected double stipendio=0,straordinario=0;


	//constructor method 
	public Dipendente(String matricola, double stipendio, double straordinario)
	{
		this.matricola = matricola;
		if(stipendio > 0)
		{
			this.stipendio = stipendio;
		}
		if(straordinario > 0)
		{
			this.straordinario = straordinario;
		}
	}

	public double getStipendio(){return stipendio;}

	public double paga(int nOre)
	{
		if(nOre >= 0)
		{
			return stipendio+(nOre*straordinario);
		}
		return stipendio;
	}

	public void stampa()
	{
		System.out.println("Matricola: " + matricola);
		System.out.println("Stipendio: " + stipendio);
		System.out.println("Straordinario: " + straordinario);
	}

}