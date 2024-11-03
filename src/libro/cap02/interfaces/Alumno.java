package libro.cap02.interfaces;

public class Alumno implements Comparable<Alumno> {
	
	private String nombre;
	private int edad;
	private double notaPromedio;
	
	public Alumno(String nombre, int edad, double notaPromedio)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.notaPromedio = notaPromedio;		
	}
	
	public int compareTo(Alumno otroAlumno)
	{
		return this.edad - otroAlumno.edad;
	}
	
	public String toString()
	{
		return nombre + ", " + edad + ", " + notaPromedio;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public double getNotaPromedio()
	{
		return notaPromedio;
	}	
}
