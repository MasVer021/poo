package prg.ex_8;

public class Persona
{
	private String codiceFiscale;
	private String nome;
	private String cognome;

	//constructor mathod
	public Persona(String nome, String cognome,String codiceFiscale)
	{
		this.setNome(nome);
		this.setCognome(cognome);
		this.setCodiceFiscale(codiceFiscale);
	}

	//get methods
	public String getCodiceFiscale(){return codiceFiscale;}
	public String getNome(){return nome;}
	public String getCognome(){return cognome;}
	
	//set methods
	public void setCodiceFiscale(String codiceFiscale){this.codiceFiscale = codiceFiscale;} //andrebbe calcolato}
	public void setNome(String nome){this.nome = nome;}
	public void setCognome(String cognome){this.cognome = cognome;}

	public String toString()
	{
		String s = "Nome: " + nome;
		s += " Cognome: " + cognome;
		s += " Codice fiscale: " + codiceFiscale;
		return s;
	}
}
