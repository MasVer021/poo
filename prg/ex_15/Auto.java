public class Auto
{
	private String targa;
	private String modello;
	private String proprietario;


	public Auto(String targa, String modello,String proprietario)
	{
		setTarga(targa);
		setModello(modello);
		setProprietario(proprietario);
	}

	private Auto(Auto a)
	{
		setTarga(a.getTarga());
		setModello(a.getModello());
		setProprietario(a.getProprietario());	
	}

	private Auto()
	{
		setTarga("TARGA NON PRESENTE");
		setModello("MODELLO NON PRESENTE");
		setProprietario("PROPRIETARIO NON PRESENTE");
	}

	public String getTarga()
	{
		return targa;
	}

	public String getModello()
	{
		return modello;
	}

	public String getProprietario()
	{
		return proprietario;
	}

	private void setTarga(String targa)
	{
		this.targa = targa;
	}

	private void setModello(String modello)
	{
		this.modello = modello;
	}

	private void setProprietario(String proprietario)
	{
		this.proprietario = proprietario;
	}

	public String toString()
	{
		String s = "Targa: " + targa;
		s += "\n";
		s += "Modello: " + modello;
		s += "\n";
		s += "Proprietario: " + proprietario;

		return s;
	}

	public Auto copy()
	{
		return  new Auto(this);
	}


}