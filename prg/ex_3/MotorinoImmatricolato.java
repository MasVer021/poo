package prg.ex_3;
import prg.ex_2.Motorino;

public class MotorinoImmatricolato extends Motorino
{
	private float maxVelocita;
	private String targa;

	//constructor method
	public MotorinoImmatricolato(String colore, String tipo,float velocita, float maxVelocita,String targa)
	{
 		super(colore,tipo,velocita);
 		this.maxVelocita = maxVelocita;
 		this.targa = targa;
	}

	@Override
	public void accellera(float velocitaAumentata)
	{
		float s = velocita + velocitaAumentata;
		if(!super.antifurto)
		{
			if(s < maxVelocita)
			{
				velocita = s;
			}
			else
			{
				velocita = maxVelocita;
			}
		}
		
	}

	public void getMax()
	{
		System.out.println("Velocità massima:"+maxVelocita);
	}

}