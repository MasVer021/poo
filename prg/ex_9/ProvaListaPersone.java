package prg.ex_9;
import prg.ex_8.*;
import java.util.Scanner;

public class ProvaListaPersone
{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		char scelta;
		String n,c,cf,u,m;
		Double s;



		System.out.print("Immettere numero massimo di persone elenco: ");
		ElencoPersone ep = new ElencoPersone(in.nextInt());

		do
        {
            System.out.println("Gestione coda di persone:");
            System.out.println("-p per inserire una nuova persona");
            System.out.println("-s per inserire un nuovo studente");
            System.out.println("-d per inserire un nuovo docente");
            System.out.println("-v per visualizzare lista persone");
            System.out.println("-e per uscire");

            scelta = in.next().charAt(0);
            scelta = Character.toLowerCase(scelta);

            switch(scelta)
            {
            case 'p':
            	System.out.print("Inserire il nome: ");
            	n = in.next();
            	System.out.print("Inserire il cognome: ");
            	c = in.next();
            	System.out.print("Inserire codice fiscale:");
            	cf = in.next();
                ep.aggiungiPersona(new Persona(n,c,cf));
                break;

            case 's':
            	System.out.print("Inserire il nome: ");
            	n = in.next();
            	System.out.print("Inserire il cognome: ");
            	c = in.next();
            	System.out.print("Inserire codice fiscale:");
            	cf = in.next();
            	System.out.print("Inserire nome universita:");
            	u = in.next();
            	ep.aggiungiPersona(new Studente(n,c,cf,u));
            	break;

            case 'd':
            	System.out.print("Inserire il nome: ");
            	n = in.next();
            	System.out.print("Inserire il cognome: ");
            	c = in.next();
            	System.out.print("Inserire codice fiscale:");
            	cf = in.next();
            	System.out.print("Inserire materia di insegnamento: ");
            	m = in.next();
            	System.out.print("Inserire salario: ");
            	s = in.nextDouble();
            	ep.aggiungiPersona(new Docente(n,c,cf,m,s));
                break;

            case 'v':
               	System.out.println(ep.toString());
                break;
            }
        }while(scelta!='e');
		
	}
}