package libro.cap02.estaticas;

public class Numero {
	
	private double valor;
	
	public Numero(double valor)
	{
		this.valor = valor;
	}
	
	public String toString()
	{
		return Double.toString(valor);
	}
	
	public static double sumar(double a, double b)
	{
		return a+b;
	}
	
	public Numero sumar(double b)
	{
		valor += b;
		return this;
	}
}
