package ex_1;

public class Docente
{
	private String nome;
	private String cognome;
	private String codice;
	private int eta;


	//constructor method
	public Docente(String nome, String cognome, String codice, int eta)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.codice = codice;

		if(eta>0) // *andrebbe impostata un età minima per essere insegnante*
		{
			this.eta = eta;
		}
	}

	public Docente(Docente d)
	{
		this.nome = d.getNome();
		this.cognome = d.getEta();
		this.codice = f.getCodice();
		this.eta = d.getEta();
	}

	//get methods

	public int getEta(){return eta;}
	public String getCognome(){return cognome;}
	public String getCodice(){return codice;}

}