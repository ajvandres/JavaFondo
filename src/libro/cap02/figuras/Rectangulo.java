package libro.cap02.figuras;

public class Rectangulo extends FiguraGeometrica {
	
	private double base, altura;
	
	public Rectangulo(double base, double altura)
	{
		super("Rectangulo");
		this.base = base;
		this.altura = altura;
	}
	
	public double area()
	{
		return base * altura;
	}
}
