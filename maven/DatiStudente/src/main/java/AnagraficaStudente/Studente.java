package AnagraficaStudente;
import java.util.Date;

public class Studente
{
	private String nome;
	private String cognome;
	private Date data;
	private static int cont=0;
	private int matricola;
	
	public Studente (String nome,String cognome)
	{
		this.nome = nome;
		this.cognome = cognome;
		cont++;
		matricola = cont;
		data= new Date();
	}
	
	// get methods
	public String getNome(){return nome;}
	public String getCognome(){return cognome;}
	public int getMatricola(){return matricola;}
	public Date getData(){return data;}

	//set methods
	public void setNome(String nome){this.nome=nome;}
	public void setCognome(String cognome){this.cognome=cognome;}
}
