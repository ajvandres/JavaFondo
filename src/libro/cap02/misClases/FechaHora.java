package libro.cap02.misClases;

import libro.cap02.fechas.Fecha;

public class FechaHora extends FechaDetallada {
	
	int hora; 
	int minutos;
	int segundos;
	
	public FechaHora(int dia, int mes, int anio, int hora, int minutos, int segundos) 
	{
		super(dia, mes, anio);
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public String toString()
	{
		return super.toString() + " ("+ this.hora + ":" + this.minutos + ":" + this.segundos + ")";
	}
}
