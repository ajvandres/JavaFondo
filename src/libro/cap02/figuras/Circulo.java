package libro.cap02.figuras;

public class Circulo extends FiguraGeometrica{

	private double radio;
	
	public Circulo(double radio)
	{
		super("Circulo");
		this.radio = radio;
	}
	
	public double area()
	{
		return Math.PI * Math.pow(radio,2);
	}
	
}
