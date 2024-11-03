package libro.cap02.figuras;

public abstract class FiguraGeometrica {
	
	private String nombre;
	
	public FiguraGeometrica(String nombre)
	{
		this.nombre = nombre;
	}
	
	public abstract double area();
	
	public String toString()
	{
		return "area = "+ area();
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public static double areaPromedio(FiguraGeometrica arr[])
	{
		int sum =0;
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i].area();
		}
		return sum/arr.length;
	}
}
