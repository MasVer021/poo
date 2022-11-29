public class Scheda
{
	public enum Stato
  {
    Data_Di_Arrivo,In_riparazione,Riparato,Consegnato;

    public static Stato getStato(String s)
    {
      switch(s)
      {
        case "Data_Di_Arrivo":
            return Data_Di_Arrivo;
            
        case "In_riparazione":
            return In_riparazione;
            
        case "Riparato":
            return Riparato;
            
        case "Consegnato":
            return Consegnato;
            
        default:
            return null;     
      }
    }
    
  }

	private Stato s;
	private static int numProgress=1;
	private int numScheda;
	private String dataArrivo;
	private static int numeroVeicoliAttuali = 0;
	private static int numeroVeicoliConsegnati = 0;
	private static int numeroVeicoliTotali = 0;
	private Auto a;

	public Scheda(Auto a, String dataArrivo)
	{
		if(a == null)
		{
			return;
		}
		this.a = a.copy();
		s = Stato.Data_Di_Arrivo;
		this.dataArrivo = dataArrivo;
		numeroVeicoliTotali ++;
    numScheda = numProgress;
    numProgress++;
	}

  public Scheda(Auto a, String dataArrivo, Stato s)
	{
		this(a,dataArrivo);
    this.s = s;
	}

  public Stato getStatus()
  {
    return s;
  }

	public void nextStatus()
	{
		switch(s)
		{
			case Data_Di_Arrivo:
				s = Stato.In_riparazione;
				numeroVeicoliAttuali++;
				break;

			case In_riparazione:
				s = Stato.Riparato;
				break;

			case Riparato:
				s = Stato.Consegnato;
				numeroVeicoliAttuali--;
				numeroVeicoliConsegnati++;
				break;

			case Consegnato :
				 default:
					break;
		}
	}

	public int getAttOfficina()
	{
		return numeroVeicoliAttuali;
	}

	public int getPassOfficina()
	{
		return numeroVeicoliConsegnati; 
	}

	public String toString()
	{
       
		String s = "Scheda: #"+numScheda; 
		s += "\n";
		s += "Stato: "+this.s;
    s += "\n";
		s += "Data di arrivo: "+this.dataArrivo;
		s += "\n";
		s += this.a.toString();

		return s;
	}



}

