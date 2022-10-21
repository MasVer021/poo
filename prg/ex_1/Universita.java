package ex_1;

public class Universita
{
	public Docente [] docenti;

	//constructor method
	public Universita(Docente [] d)
	{
		int n_docenti = d.lenght;
		docenti = new Docente[n_docenti];
		for(int i=0;i<n_docenti;i++)
		{
			docenti[i]=new Docente(d[i]);
		}
	}

	public int etaMinima()
	{
		int min = docenti[0].getEta();
		
		for(int i=1;i<docenti.lenght;i++)
		{
			if(docenti[i].getEta()<min)
			{
				min =docenti[i].getEta();
			}
		}	

		return min;
	}

		

	
}