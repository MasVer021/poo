package prg.ex_8;


public class Studente extends Persona
{
	private static int contatore = 0;
	private int matricola;
	private String universita;

	public Studente(String nome,String cognome,String codiceFiscale,String universita)
	{
		super(nome,cognome,codiceFiscale);
		this.setUniversita(universita);
		matricola = contatore;
		contatore ++;
	}

	//get methods
	public String getUniversita(){return universita;}
	public int getMatricola(){return matricola;}

	//set methods
	public void setUniversita(String universita){this.universita = universita;}

	@Override
	public String toString()
	{
		String s = super.toString();
		s += " Matricola: " + matricola;
		s += " Universita: " + universita;

		return s;
	}
}