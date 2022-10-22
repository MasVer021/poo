package prg.ex_9;
import prg.ex_8.*;

public class ElencoPersone
{
	private Persona [] p;
	private int indice = 0;

	public ElencoPersone(int nPersone)
	{
		if(nPersone > 0)
		{
			p = new Persona[nPersone];
		}
	
	}
	public void aggiungiPersona(Persona p)
	{
		this.p[indice] = p;
		indice ++;
	}

	public String toString()
	{

		String s = "Lista persone:\n";
		for(int i = 0;i < indice;i++)
		{
			s +=  "#" + (i+1) +" ";
			s += p[i].toString() + "\n\n";
		}

		return s;
	}
}