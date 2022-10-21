package prg.ex_2;

public class Motorino
{
	private String colore;
	protected float velocita;
	private String tipo;//marca e tipo
	protected boolean antifurto = false;

	//constructor method
	public Motorino(String colore, String tipo,float velocita)
	{
		this.colore = colore;
		this.tipo = tipo;
		this.velocita = velocita;
	}

	// get methods
	public float getVelocita(){return velocita;}

	public void accellera(float velocitaAumentata)
	{
		if(!antifurto)
		{
			velocita+=velocitaAumentata;
		}
		
	}

	public void inserisciAntifurto(){antifurto=true;}

	public static void main(String[] args) {
		System.out.println("ciao");
	}
}