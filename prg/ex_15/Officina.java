import java.util.*;
import java.io.*;

public class Officina
{
	private ArrayList<Scheda> schedeAuto;


	public Officina()
	{
		schedeAuto = new ArrayList<Scheda>();
	}

	public boolean addCar(Scheda a)
  {

		return schedeAuto.add(a);	
	}

  public void print()
  {
    for(Scheda a : schedeAuto)
			{
				System.out.println(a.toString()+"\n");
			}
  }

	public void printFile(String nomeFile)
	{
		try
		{
			PrintWriter printOut = new PrintWriter(new BufferedWriter(new FileWriter(nomeFile))); 

			for(Scheda a : schedeAuto)
			{
				printOut.println(a.toString()+"\n");
			}

			printOut.close();

		}
		catch (IOException e) 
		{
      e.printStackTrace();
    }
	}

  public void printFile(String nomeFile,Scheda.Stato s)
	{
		try
		{
			PrintWriter printOut = new PrintWriter(new BufferedWriter(new FileWriter(nomeFile))); 

			for(Scheda a : schedeAuto)
			{
        if(a.getStatus().equals(s))
        {
				  printOut.println(a.toString()+"\n");
        }
				
			}
      
			printOut.close();

		}
		catch (IOException e) 
		{
      e.printStackTrace();
    }    
	}
  
  public void nextStatus(int numScheda)
  {
    schedeAuto.get(numScheda-1).nextStatus();
  }
  


  public void loadFile(String nomeFile)
  {
    String stat=null, Data_Arrivo=null, Targa=null, Modello=null, Proprietario=null;
  		try
  		{
  			BufferedReader fileR = new BufferedReader(new FileReader(nomeFile)); 
  
  			String nextStr = fileR.readLine();
             
        while (nextStr != null)
        {
  
          if(!nextStr.equals("") && nextStr.substring(0,7).equals("Scheda:"))
          {
            stat = fileR.readLine().substring(7);
            Data_Arrivo = fileR.readLine().substring(16);
            Targa = fileR.readLine().substring(7);
            Modello = fileR.readLine().substring(9);
            Proprietario = fileR.readLine().substring(14);
  
            
  
            this.addCar(new Scheda(new Auto(Targa,Modello,Proprietario),Data_Arrivo,Scheda.Stato.getStato(stat)));
          }
          nextStr = fileR.readLine(); 
        } 
        fileR.close();
  
  		}
  		catch (IOException e) 
  		{
        e.printStackTrace();
      }
  }

  public void delCon()
  {
    Scheda s,del;
    Iterator <Scheda> it = schedeAuto.iterator();
    while(it.hasNext())
    {
      s=it.next();
      if(s.getStatus().equals(Scheda.Stato.Consegnato))
      {
        del = s; 
        s=it.next();
				schedeAuto.remove(del);
      }
    }
  }
}