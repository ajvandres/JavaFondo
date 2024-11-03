package libro.cap02.instancias;

import libro.cap02.fechas.Fecha;
import libro.cap02.misClases.FechaDetallada;

public class Persona {
	
	private String nombre; //Atributo
	private String dni; //Atributo
	private Fecha fechaNacimiento; //Atributo
	
	private int cont = 0;  // varible del estado
	
	public Persona(String nombre, String dni, Fecha fechaNac)
	{
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNac;
	}
	
	public String toString()
	{
		cont++;  //Cuantas veces se invoca el metodo toString()
		return nombre + ", DNI: " + dni
				 	  + ", nacido el: " + fechaNacimiento
				 	  + " (" + cont + ")";
	}
}
