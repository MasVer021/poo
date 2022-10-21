package prg.ex_4;
import prg.ex_2.*;
import prg.ex_3.*;

public class UsoMotorino
{
	public static void main(String[] args) {
		Motorino m = new Motorino("grigiometallizzato","Piaggio Liberty",40.5f);
		float vel = m.getVelocita();

		MotorinoImmatricolato mi = new MotorinoImmatricolato("rosso","Aprilia Scarabeo",30.5f,60.0f,"CV1234");
		mi.getMax();

		m.accellera(30.7f);
		mi.accellera(30.7f);

		System.out.println(m.getVelocita());
		
		System.out.println(mi.getVelocita());


	}
}