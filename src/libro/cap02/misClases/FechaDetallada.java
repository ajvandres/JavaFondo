package libro.cap02.misClases;

import libro.cap02.fechas.Fecha;

public class FechaDetallada extends Fecha {
	
	private String meses[] = {"Enero"
							 ,"Febrero"
							 ,"Marzo"
							 ,"Abril"
							 ,"Mayo"
							 ,"Junio"
							 ,"Julio"
							 ,"Agosto"
							 ,"Septiembre"
							 ,"Octubre"
							 ,"Noviembre"
							 ,"Noviembre"
							 ,"Diciembre"};
	
	public FechaDetallada(int dia, int mes, int anio)
	{
		super(dia, mes, anio);
	}
	public FechaDetallada()
	{
		this(1,1,2000);
	}
	
	public String toString()
	{
		return this.getDia() +" de "+ meses[this.getMes()-1] + " de " + this.getAnio();
	
	}
}
