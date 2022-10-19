package AnagraficaStudente;

public class App 
{
    public static void main( String[] args )
    {
    	Studente s = new Studente("Massimo","Verdino");
    	System.out.println("Studente: "+s.getNome()+" "+s.getCognome()+" "+s.getMatricola()+" "+s.getData());
       
    }
}
