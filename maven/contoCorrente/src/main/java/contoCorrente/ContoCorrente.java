package contoCorrente;


public class ContoCorrente
{
	private float saldo;
	private String nome;
	private String cognome;
	private int indice =0;
	private final int nMovimenti= 5;
	private float [] listaMovimenti=new float[nMovimenti];

	public ContoCorrente(String nome,String cognome)
	{
		setIntestatario(nome,cognome);
		saldo=0;
	}

	//private methods
	private void setIntestatario(String nome,String cognome)
	{
		this.nome=nome;
		this.cognome=cognome;
	}
	private void addMovimento(float valMovimento)
	{
		listaMovimenti[indice]=valMovimento;
		indice = (indice+1)%nMovimenti;
	}

	//get methods
	public float getSaldo(){return saldo;}
	public String getIntestatario(){return cognome+" "+nome;}

	
	//public methods
	public void prelievo(float valPrelievo)
	{
		if(saldo >= valPrelievo && valPrelievo>0)
		{
			saldo -= valPrelievo;
			this.addMovimento(valPrelievo*-1);
		}

	}

	public void versamento(float valVersamento)
	{
		if(valVersamento>0)
		{
			saldo += valVersamento;
			this.addMovimento(valVersamento);
		}
	}

	public void printMovimenti()
	{
		int j=indice;

		do{
			if(listaMovimenti[j]!=0)
			{
				System.out.println(listaMovimenti[j]);
			}
			j=(j+1)%nMovimenti;
		}while(j!=indice);
	}

}
