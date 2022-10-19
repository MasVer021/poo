package contoCorrente;
import java.util.Scanner;
import java.lang.Character;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        ContoCorrente cc = new ContoCorrente("Massimo","Verdino");
        char scelta;
        float value;


        do
        {
            System.out.println("Gestione del conto corrente:");
            System.out.println("-i per visualizzare intestatario");
            System.out.println("-l per visualizzare gli ultimi movimenti");
            System.out.println("-p per effettuare un prelievo");
            System.out.println("-v per effettuare un versamento");
            System.out.println("-s per visualizzare il saldo corrente");
            System.out.println("-e per uscire");

            scelta=scan.next().charAt(0);
            scelta = Character.toLowerCase(scelta);

            switch(scelta)
            {
            case 'i':
                System.out.println("Intestatario :"+cc.getIntestatario());
                break;

            case 'l':
                System.out.println("Lista ultimi 5 movimenti effettuati:");
                cc.printMovimenti();
                break;

            case 'p':
                System.out.print("Inserire l'importo da prelevare:");
                value = scan.nextFloat();
                cc.prelievo(value);
                break;

            case 's':
                System.out.println("Saldo corrente :"+cc.getSaldo());
                break;

            case 'v':
                System.out.print("Inserire l'importo da versare:");
                value = scan.nextFloat();
                cc.versamento(value);
                break;
            }
        }while(scelta!='e');

    }
}
