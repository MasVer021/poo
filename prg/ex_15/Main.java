public class Main
{
	public static void main(String[] args) 
  {
    
	Officina o = new Officina();
    /*
	o.addCar(new Scheda(new Auto("DV675FR","Focus","Samuele"),"10-10-2023"));
    o.addCar(new Scheda(new Auto("GF675HT","Fiesta","Sandro"),"06-10-2023"));
    o.addCar(new Scheda(new Auto("BY789OP","159","Francesco"),"05-12-2022"));
    o.addCar(new Scheda(new Auto("M43MMT","Alfa Romeo","Maximino"),"02-01-2021"));
    o.nextStatus(2);
    o.nextStatus(2);
    o.nextStatus(2);

    o.nextStatus(3);
    o.nextStatus(3);

    o.nextStatus(4);
    System.out.println("Stampa tutti");
    o.printFile("all.txt");

    System.out.println("Stampa in riparazione");
    o.printFile("inRip.txt",Scheda.Stato.In_riparazione);

    System.out.println("Stampa riparato");
    o.printFile("rip.txt",Scheda.Stato.Riparato);

    System.out.println("Stampa consegnato");
    o.printFile("con.txt",Scheda.Stato.Consegnato);
    */
    o.loadFile("all.txt");
    o.print();

    o.delCon();
    o.print();

    
	}
  
}