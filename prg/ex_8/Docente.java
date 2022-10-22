package prg.ex_8;


public class Docente extends Persona
{
	
	private String materia;
	private double salario;

	public Docente(String nome,String cognome,String codiceFiscale,String materia,double salario)
	{
		super(nome,cognome,codiceFiscale);
		this.setMateria(materia);
		this.setSalario(salario);
		
	}

	//get methods
	public String getMateria(){return materia;}
	public double getSalario(){return salario;}

	//set methods
	public void setMateria(String materia){this.materia = materia;}
	public void setSalario(double salario)
	{
		if(salario>0)
		{
			this.salario = salario;
		}
		else
		{
			this.salario = 0;
		}
	}

	@Override
	public String toString()
	{
		String s = super.toString();
		s += " Materia: " + materia;
		s += " Salario: " + salario;

		return s;
	}
}